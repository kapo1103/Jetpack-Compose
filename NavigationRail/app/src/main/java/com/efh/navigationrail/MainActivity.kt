package com.efh.navigationrail

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.efh.navigationrail.ui.theme.NavigationRailTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rail()
        }
    }
}


@Composable
fun Rail() {

    var tabIndex by remember { mutableStateOf(0) }
    val tabTitles = listOf("home", "settings", "profile")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Search, Icons.Filled.Settings)

    Row {
        NavigationRail{
            tabTitles.forEachIndexed { index, item ->

                NavigationRailItem(
                    modifier = Modifier.background(color = if (tabIndex == index) Color.LightGray else Color.Transparent),
                    label = { Text (text = item) },
                    icon = { Icon(icons[index], contentDescription = null) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index } ,
                )

            }
        }

        when(tabIndex) {
            0 -> {
                HomeScreen()
            }
            1 -> {
                SettingsScreen()
            }
            2-> {
                ProfileScreen()
            }
        }
    }
}



@Composable
fun HomeScreen (
) {
    Text(
        text = "home"
    )
}

@Composable
fun SettingsScreen (
) {
    Text(
        text = "settings"
    )
}

@Composable
fun ProfileScreen (
) {
    Text(
        text = "profile"
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Rail()
}