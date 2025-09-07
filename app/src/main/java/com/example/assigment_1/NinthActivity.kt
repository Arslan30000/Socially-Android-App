package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class NinthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_page)
        val Call_btn: ImageView = findViewById(R.id.video_icon)
        Call_btn.setOnClickListener {
            val intent = Intent(this, TenthActivity::class.java)
            startActivity(intent)
            finish()
        }
        val Back_btn: ImageView = findViewById(R.id.back_icon)
        Back_btn.setOnClickListener {
            val intent = Intent(this, EightAvtivity::class.java)
            startActivity(intent)
            finish()
        }
    }



}