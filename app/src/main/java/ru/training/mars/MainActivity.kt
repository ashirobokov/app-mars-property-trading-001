package ru.training.mars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import ru.training.mars.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val propertyList = DataSource(this).getPropertyList().asList()
        val propertyRecyclerView: RecyclerView = binding.marsProperties
        propertyRecyclerView.adapter = MarsPropertyAdapter(propertyList)
    }
}