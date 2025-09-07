package com.example.assigment_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val Searchbtn: ImageView = findViewById(R.id.search_icon)
        Searchbtn.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
