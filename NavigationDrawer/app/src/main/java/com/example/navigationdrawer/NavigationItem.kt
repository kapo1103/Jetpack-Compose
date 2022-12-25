package com.example.navigationdrawer

sealed class NavigationItem(
    var route : String,
    var title : String,
    var icon : Int

){
    object Home : NavigationItem("home","Home",R.drawable.ic_baseline_home_24)
    object Profile : NavigationItem("Profile","Profile",R.drawable.ic_baseline_man_24)
    object Settings : NavigationItem("Settings","Settings",R.drawable.ic_baseline_settings_24)
    object Share : NavigationItem("Share","Share",R.drawable.ic_baseline_share_24)
    object Contact : NavigationItem("Contact","Contact",R.drawable.ic_baseline_contact_page_24)

}
