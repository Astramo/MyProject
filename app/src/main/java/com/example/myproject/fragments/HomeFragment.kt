package com.example.myproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myproject.adapters.FoodsAdapter
import com.example.myproject.databinding.FragmentHomeBinding
import com.example.myproject.viewmodels.HomeViewModel
import org.koin.android.ext.android.get

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var homeViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeViewModel = get()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel.isLoaded.subscribe { a ->
            if (a)
                binding.loader.visibility = View.GONE
            else binding.loader.visibility = View.VISIBLE
        }.isDisposed

        homeViewModel.observerData().observe(viewLifecycleOwner, { data ->
            binding.homeRv.adapter =
                FoodsAdapter(data)

        })

    }

    companion object {
        @JvmStatic
        fun newInstance() =
            HomeFragment().apply {
            }
    }
}