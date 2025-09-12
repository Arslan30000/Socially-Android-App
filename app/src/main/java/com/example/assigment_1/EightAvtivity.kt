package com.example.assigment_1
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class EightAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat)

        val Chatbtn: RelativeLayout = findViewById(R.id.p1)
        Chatbtn.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
            finish()
        }
        val Chatbtn_2: RelativeLayout = findViewById(R.id.p2)
        Chatbtn_2.setOnClickListener {
            val intent = Intent(this, NinthActivity::class.java)
            startActivity(intent)
            finish()
        }

        val Back_btn: ImageView= findViewById(R.id.back_icon)
        Back_btn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}