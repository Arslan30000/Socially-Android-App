package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EleventhActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recent_activity)
        val homebtn: ImageView = findViewById(R.id.home_icon)
        homebtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
            finish()
        }
        val searchBtn: ImageView = findViewById(R.id.search_icon)
        searchBtn.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
            finish()
        }
        val you_button: TextView= findViewById(R.id.tab_you)
        you_button.setOnClickListener {
            val intent = Intent(this, TwelfthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
