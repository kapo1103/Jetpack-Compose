package com.efh.composetabrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            tabs()
        }
    }
}

@Composable
fun tabs() {
    var tabIndex by remember { mutableStateOf(0) } // 1.

    val tabTitles = listOf("tab1", "tab2", "tab3")

    Column { // 2.
        TabRow(selectedTabIndex = tabIndex) { // 3.
            tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = tabIndex == index, // 4.
                    onClick = { tabIndex = index },
                    text = { Text(text = title) },
                    modifier = Modifier.background(color = if (tabIndex == index) Color.Red else Color.DarkGray),

                    ) // 5.
            }

        }
        when (tabIndex) { // 6.
            0 -> TabOne()
            1 -> TabTwo()
            2 -> TabThree()
        }
    }
}


    @Composable
    fun TabOne() {
        Text(
            text = "tab1"
        )
    }

    @Composable
    fun TabTwo() {
        Text(
            text = "tab2"
        )
    }

    @Composable
    fun TabThree() {
        Text(
            text = "tab3"
        )
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {

        tabs()
    }




