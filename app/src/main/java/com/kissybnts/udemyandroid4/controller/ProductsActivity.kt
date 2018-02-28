package com.kissybnts.udemyandroid4.controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.kissybnts.udemyandroid4.R
import com.kissybnts.udemyandroid4.adapter.ProductsAdapter
import com.kissybnts.udemyandroid4.services.DataService
import com.kissybnts.udemyandroid4.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        val products = DataService.getProducts(categoryType)
        adapter = ProductsAdapter(this, products)

        val spanCount = getSpanCount()
        val layoutManager = GridLayoutManager(this, spanCount)

        productsListView.adapter = adapter
        productsListView.layoutManager = layoutManager
    }

    /**
     * return span count according to the width or orientation.
     */
    private fun getSpanCount(): Int {
        if (resources.configuration.screenWidthDp > 720) {
            return 3
        }

        return if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) 4 else 2
    }
}
