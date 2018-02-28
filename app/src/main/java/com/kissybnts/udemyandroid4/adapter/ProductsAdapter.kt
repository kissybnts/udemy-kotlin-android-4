package com.kissybnts.udemyandroid4.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.kissybnts.udemyandroid4.R
import com.kissybnts.udemyandroid4.model.Product

class ProductsAdapter(private val conntext: Context,
                      private val products: List<Product>) : RecyclerView.Adapter<ProductsAdapter.Holder>() {
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindProduct(products[position], conntext)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(conntext).inflate(R.layout.product_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView? = itemView?.findViewById(R.id.productImage)
        private val productName: TextView? = itemView?.findViewById(R.id.productName)
        private val productPrice: TextView? = itemView?.findViewById(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price
        }
    }
}