package com.example.todo

import androidx.annotation.DrawableRes

data class BucketListItem(
    val heading: String,
    val description: String,
    @DrawableRes
    val image: Int,
    val rating: Float
)
