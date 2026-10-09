package com.argy.questtugaslayout_0128

import androidx.annotation.ColorRes
import androidx.annotation.StringRes

data class StudentCardData(
    @StringRes val nameRes: Int,
    @StringRes val phoneRes: Int,
    @StringRes val addressRes: Int,
    @ColorRes val backgroundColorRes: Int,
    @ColorRes val addressColorRes: Int,
    @ColorRes val phoneColorRes: Int,
    val isCursiveFont: Boolean = false
)
