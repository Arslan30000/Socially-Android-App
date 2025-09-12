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
        val messagebtn: ImageView = findViewById(R.id.share)
        messagebtn.setOnClickListener {
            val intent = Intent(this, EightAvtivity::class.java)
            startActivity(intent)
            finish()
        }
        val like_btn: ImageView = findViewById(R.id.like_icon)
        like_btn.setOnClickListener {
            val intent = Intent(this, EleventhActivity::class.java)
            startActivity(intent)
            finish()
        }
        val create_post_btn: ImageView = findViewById(R.id.post_icon)
        create_post_btn.setOnClickListener {
            val intent = Intent(this, FifteenthActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
