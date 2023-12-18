package com.example.recyclerviewalloveras

class SuperHeroProvider {
    companion object{
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "ArnauLl",
                "https://cursokotlin.com/wp-content/uploads/2020/09/Webp.net-compress-image.jpg"
            ),
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Mateo",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
            ),
        )
    }
}