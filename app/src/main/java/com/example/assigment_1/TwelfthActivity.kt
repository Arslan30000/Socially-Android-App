package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class TwelfthActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.your_activity)
        val follow_btn: RelativeLayout= findViewById(R.id.following_tab)
        follow_btn.setOnClickListener {
            val intent = Intent(this, EleventhActivity::class.java)
            startActivity(intent)
            finish()
        }
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
        val HighPage: ImageView=findViewById(R.id.post_icon)
        HighPage.setOnClickListener {
            val intent = Intent(this, ThirteenActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}
