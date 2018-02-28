package com.kissybnts.udemyandroid4.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kissybnts.udemyandroid4.R
import com.kissybnts.udemyandroid4.utils.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
