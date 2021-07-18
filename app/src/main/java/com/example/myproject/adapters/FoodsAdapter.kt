package com.example.myproject.adapters

import android.opengl.Visibility
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject.databinding.FoodsRowLayoutBinding
import com.example.myproject.models.server_side.ServerModel

class FoodsAdapter(var data: List<ServerModel>) :
    RecyclerView.Adapter<FoodsAdapter.FoodsViewHolder>() {


    class FoodsViewHolder(private val binding: FoodsRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(items: ServerModel) {
            binding.data = items
            if (position != 0){
                binding.discountText.visibility = ViewGroup.GONE
                binding.discountImg.visibility = ViewGroup.GONE
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        return FoodsViewHolder(
            FoodsRowLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {
        data[position].let { holder.bindData(it) }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}