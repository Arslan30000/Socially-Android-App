package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThirteenActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.highlights_page)
        val Edit_prof: ImageView = findViewById(R.id.options_9)
        Edit_prof.setOnClickListener {
            val intent = Intent(this, FourteenthActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}