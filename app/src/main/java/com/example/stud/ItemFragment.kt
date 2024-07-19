package com.example.stud

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.stud.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class ItemFragment : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Fragment_datastud.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the text and image programmatically if needed
        binding.cardText.text = "Hello, this is your card!"
        binding.rightImage.setImageResource(R.drawable.ic_right_image) // Replace with your image resource
    }
}