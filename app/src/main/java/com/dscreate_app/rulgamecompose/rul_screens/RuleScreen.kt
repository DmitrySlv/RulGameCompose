package com.dscreate_app.rulgamecompose.rul_screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dscreate_app.rulgamecompose.R

@Composable
fun RuleScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .wrapContentHeight()
                .wrapContentWidth(),
            text = "0",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp,
            color = White
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.ruleta),
                contentDescription = "Рулетка",
                modifier = Modifier.fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.flecha),
                contentDescription = "Указатель",
                modifier = Modifier.fillMaxSize()
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "Старт",
                color = White
            )
        }
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = Black),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(
                text = "Тестовая кнопка",
                color = White
            )
        }
    }
}