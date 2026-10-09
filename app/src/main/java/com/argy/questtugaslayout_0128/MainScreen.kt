package com.argy.questtugaslayout_0128

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier) {
    val studentList = listOf(
        StudentCardData(
            nameRes = R.string.name_1,
            phoneRes = R.string.phone_1,
            addressRes = R.string.address_1,
            backgroundColorRes = R.color.card_gray,
            addressColorRes = R.color.yellow_text,
            phoneColorRes = R.color.cyan_text,
            isCursiveFont = true
        ),
        StudentCardData(
            nameRes = R.string.name_2,
            phoneRes = R.string.phone_2,
            addressRes = R.string.address_2,
            backgroundColorRes = R.color.card_purple,
            addressColorRes = R.color.yellow_text,
            phoneColorRes = R.color.cyan_text,
            isCursiveFont = false
        ),
        StudentCardData(
            nameRes = R.string.name_3,
            phoneRes = R.string.phone_3,
            addressRes = R.string.address_3,
            backgroundColorRes = R.color.card_blue,
            addressColorRes = R.color.white,
            phoneColorRes = R.color.cyan_text,
            isCursiveFont = false
        ),
        StudentCardData(
            nameRes = R.string.name_4,
            phoneRes = R.string.phone_4,
            addressRes = R.string.address_4,
            backgroundColorRes = R.color.card_green,
            addressColorRes = R.color.white,
            phoneColorRes = R.color.cyan_text,
            isCursiveFont = false
        )
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(16.dp))

            // Header
            Text(
                text = stringResource(id = R.string.title_tekno),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.subtitle_umy),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Loop Komponen Card
            studentList.forEach { student ->
                StudentCardWidget(data = student)
            }
        }

        // Footer Copyright
        Text(
            text = stringResource(id = R.string.copyright_text),
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
    }
}