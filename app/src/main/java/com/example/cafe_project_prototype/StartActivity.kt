package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val intent2 = Intent(this, BrandActivity::class.java)

        val buttonView1 = findViewById<Button>(R.id.btn_choiceshop)

        buttonView1.setOnClickListener {
            startActivity(intent2)
        }
        val intent5 = Intent(this, FavoriteActivity::class.java)

        val buttonView5 = findViewById<Button>(R.id.btn_favorite)

        buttonView5.setOnClickListener {
            startActivity(intent5)
        }
    }
}