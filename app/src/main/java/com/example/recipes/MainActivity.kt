package com.example.recipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipes.Utils.Utils.dataSet
import com.example.recipes.adapters.DishAdapter
import com.example.recipes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = DishAdapter(dataSet) {
            Toast.makeText(this, this.getText(it.titleId), Toast.LENGTH_SHORT).show()
        }

        with(binding) {
            mainRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            mainRecyclerView.adapter = adapter
        }
    }
}