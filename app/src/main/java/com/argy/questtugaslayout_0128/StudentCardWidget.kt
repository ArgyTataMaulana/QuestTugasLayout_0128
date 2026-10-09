package com.argy.questtugaslayout_0128

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StudentCardWidget(
    data: StudentCardData,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = data.backgroundColorRes)
        )
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            // Logo UMY Kiri
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(52.dp)
            )

            // Content Teks (Nama, No HP, Alamat)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 12.dp)
            ){
                Text(
                    text = stringResource(id = data.nameRes),
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = if (data.isCursiveFont) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (data.isCursiveFont) FontFamily.Cursive else FontFamily.Default
                )
                Text(
                    text = stringResource(id = data.phoneRes),
                    color = colorResource(id = data.phoneColorRes),
                    fontSize = 13.sp
                )
                Text(
                    text = stringResource(id = data.addressRes),
                    color = colorResource(id = data.addressColorRes),
                    fontSize = 13.sp
                )
            }
        }
    }
}