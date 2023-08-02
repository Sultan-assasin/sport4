package com.sula.sport4.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val image: Int,
    val foodName: String
) : Parcelable