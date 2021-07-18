package com.example.myproject.models.server_side

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.gson.annotations.SerializedName

data class ServerModel(

    @field:SerializedName("isAvailable")
    val isAvailable: Boolean? = null,

    @field:SerializedName("courseType")
    val courseType: CourseType? = null,

    @field:SerializedName("fee")
    val fee: Int? = null,

    @field:SerializedName("mealType")
    val mealType: MealType? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("cuisineType")
    val cuisineType: CuisineType? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("maximumCalorie")
    val maximumCalorie: Int? = null,

    @field:SerializedName("preparation")
    val preparation: Int? = null,

    @field:SerializedName("isAcceptingDelivery")
    val isAcceptingDelivery: Boolean? = null,

    @field:SerializedName("subTitle")
    val subTitle: String? = null,

    @field:SerializedName("rate")
    val rate: Int? = null,

    @field:SerializedName("price")
    val price: Double? = null,

    @field:SerializedName("ingredients")
    val ingredients: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("gallery")
    val gallery: String? = null,

    @field:SerializedName("isAcceptingPickup")
    val isAcceptingPickup: Boolean? = null,

    @field:SerializedName("delivery")
    val delivery: Int? = null,

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("special")
    val special: Special? = null,

    @field:SerializedName("isCatering")
    val isCatering: Boolean? = null,

    @field:SerializedName("minimumCalorie")
    val minimumCalorie: Int? = null,

    @field:SerializedName("menuType")
    val menuType: MenuType? = null,

    @field:SerializedName("rewards")
    val rewards: List<Any?>? = null,

    @field:SerializedName("isFavorite")
    val isFavorite: Boolean? = null
)

data class CuisineType(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("priority")
    val priority: Int? = null
)

data class MealType(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("priority")
    val priority: Int? = null
)

data class CourseType(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("priority")
    val priority: Int? = null
)

data class MenuType(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("priority")
    val priority: Int? = null
)

data class Special(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("amount")
    val amount: Int? = null,

    @field:SerializedName("quantity")
    val quantity: Int? = null,

    @field:SerializedName("voucher")
    val voucher: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("remainingTime")
    val remainingTime: Int? = null,

    @field:SerializedName("transcript")
    val transcript: String? = null,

    @field:SerializedName("percentage")
    val percentage: Int? = null,

    @field:SerializedName("limit")
    val limit: Int? = null,

    @field:SerializedName("beginTime")
    val beginTime: String? = null,

    @field:SerializedName("value")
    val value: Int? = null,

    @field:SerializedName("policy")
    val policy: String? = null
)

@BindingAdapter("android:glide")
fun setPaddingLeft(view: ImageView, link: String) {
    Glide.with(view)
        .load(link)
        .into(view)
}
