package com.example.playlistmaker

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

        val mediaClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Нажали на media!", Toast.LENGTH_SHORT).show()
            }
        }

        media.setOnClickListener(mediaClickListener)

        search.setOnClickListener{
            Toast.makeText(this@MainActivity, "Нажали на search!", Toast.LENGTH_SHORT).show()
        }
        settings.setOnClickListener{
            Toast.makeText(this@MainActivity, "Нажали на settings!", Toast.LENGTH_SHORT).show()
        }
    }
}