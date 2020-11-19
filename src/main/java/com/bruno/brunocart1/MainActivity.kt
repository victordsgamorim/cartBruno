package com.example.brunocart

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bruno.brunocart1.R
import com.bruno.brunocart1.model.Product
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)

        val products = arrayListOf<Product>()
        for (i in 0..100) {
            products.add(Product("PapperMint Tea", "", 1.99))
        }

        recyclerView_main.apply {
            layoutManager = LinearLayoutManager( this@MainActivity)
            adapter = ProductsAdapter(products)
        }
    }
}

