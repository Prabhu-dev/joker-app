package com.example.joker.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Joker(
    @StringRes
    val stringResourceId: Int,
    @DrawableRes
    val imageResourceId: Int
)

