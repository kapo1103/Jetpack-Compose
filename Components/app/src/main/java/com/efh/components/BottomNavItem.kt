package com.efh.components


// Route: İçeriğin temsil edeceği ekran için
// Title: İçeriğin bulunacağı yazı için
// Icon: İçeriğin bulunacağı görsel/ikon için
// icon_focused içerik tıklandıktan sonra bulunacağı görsel/ikon için


sealed  class BottomNavItem(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused : Int
) {
    object Home : BottomNavItem(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_baseline_home_24,
        icon_focused = R.drawable.ic_baseline_add_home_24

    )

    object Report: BottomNavItem (
        route = "report",
        title = "Report",
        icon = R.drawable.ic_baseline_report_24,
        icon_focused = R.drawable.ic_baseline_report_problem_24
            )

    object Profile: BottomNavItem(

        route = "profile",
        title = "Profile",
        icon = R.drawable.ic_baseline_man_24,
        icon_focused = R.drawable.ic_baseline_elderly_woman_24
    )

}
