package com.argy.questtugaslayout_0128

import androidx.compose.runtime.Composable

@Composable
fun MainScreen() {
    val studentList = listOf(
        StudentCardData(
            nameRes = R.string.name_1,
            phoneRes = R.string.phone_1,
            addressRes = R.string.address_1,
            backgroundColorRes = R.color.card_gray,
            addressColorRes = R.color.yellow_text
        ),
        StudentCardData(
            nameRes = R.string.name_2,
            phoneRes = R.string.phone_2,
            addressRes = R.string.address_2,
            backgroundColorRes = R.color.card_purple,
            addressColorRes = R.color.yellow_text
        ),
        StudentCardData(
            nameRes = R.string.name_3,
            phoneRes = R.string.phone_3,
            addressRes = R.string.address_3,
            backgroundColorRes = R.color.card_blue,
            addressColorRes = R.color.white
        ),
        StudentCardData(
            nameRes = R.string.name_4,
            phoneRes = R.string.phone_4,
            addressRes = R.string.address_4,
            backgroundColorRes = R.color.card_green,
            addressColorRes = R.color.white
        )
}