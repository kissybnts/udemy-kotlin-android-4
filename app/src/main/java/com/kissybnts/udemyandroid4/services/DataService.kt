package com.kissybnts.udemyandroid4.services

import com.kissybnts.udemyandroid4.model.Category
import com.kissybnts.udemyandroid4.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Hat1", "$18", "hat1"),
            Product("Hat2", "$26", "hat2"),
            Product("Hat3", "$10", "hat3"),
            Product("Hat4", "$199", "hat4")
    )

    val hoodies = listOf(
            Product("Hoodies 1", "$50", "hoodie1"),
            Product("Hoodies 2", "$44", "hoodie2"),
            Product("Hoodies 3", "$56", "hoodie3"),
            Product("Hoodies 4", "$59", "hoodie4")
    )

    val shirts = listOf(
            Product("Shirts 1", "$10", "shirt1"),
            Product("Shirts 2", "$11", "shirt2"),
            Product("Shirts 3", "$12", "shirt3"),
            Product("Shirts 4", "$13", "shirt4"),
            Product("Shirts 5", "$14", "shirt5")
    )
}