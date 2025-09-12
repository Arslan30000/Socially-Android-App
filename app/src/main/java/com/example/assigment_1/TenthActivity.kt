package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TenthActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.call_page)
        val Back_btn: ImageView = findViewById(R.id.decline)
        Back_btn.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
