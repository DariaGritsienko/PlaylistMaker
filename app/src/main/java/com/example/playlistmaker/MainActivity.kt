package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val media = findViewById<Button>(R.id.media)
        val search = findViewById<Button>(R.id.search)
        val settings = findViewById<Button>(R.id.settings)

        media.setOnClickListener{
            val displayIntent = Intent(this, Media::class.java)
            startActivity(displayIntent)
        }

        search.setOnClickListener {
            val displayIntent = Intent(this, Search::class.java)
            startActivity(displayIntent)
        }
        settings.setOnClickListener {
            val displayIntent = Intent(this, Settings::class.java)
            startActivity(displayIntent)
        }
    }
}