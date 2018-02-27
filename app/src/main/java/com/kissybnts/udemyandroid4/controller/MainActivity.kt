package com.kissybnts.udemyandroid4.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.kissybnts.udemyandroid4.R
import com.kissybnts.udemyandroid4.adapter.CategoryAdapter
import com.kissybnts.udemyandroid4.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
