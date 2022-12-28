package com.efh.composenavigation.screens

import android.provider.ContactsContract.Profile
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp

@Composable
fun Profile (
    onNavigate: () -> Unit,
    userId : String // arguments
) {

    // argument
    val context = LocalContext.current
    LaunchedEffect(key1 = true) {
        Toast.makeText(context, userId, Toast.LENGTH_LONG).show()
    }



    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "profile", modifier = Modifier, fontSize = 30.sp)

        Button(
            onClick = {
            onNavigate.invoke()
        }
        ) {

            Text(text = "Button")
        }
    }
}