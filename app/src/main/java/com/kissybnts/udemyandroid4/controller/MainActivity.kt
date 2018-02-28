package com.kissybnts.udemyandroid4.controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.kissybnts.udemyandroid4.R
import com.kissybnts.udemyandroid4.adapter.CategoryRecycleAdapter
import com.kissybnts.udemyandroid4.services.DataService
import com.kissybnts.udemyandroid4.utils.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productsActivity = Intent(this, ProductsActivity::class.java).apply {
                putExtra(EXTRA_CATEGORY, category.title)
            }
            startActivity(productsActivity)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
