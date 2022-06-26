package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val intent3= Intent(this, StartActivity::class.java)

        val buttonView3 = findViewById<Button>(R.id.btn_f_back)

        buttonView3.setOnClickListener {
            startActivity(intent3)
        }

        val intent10= Intent(this, Edia_f_Activity::class.java)

        val buttonView10 = findViewById<Button>(R.id.btn_f_edia)

        buttonView10.setOnClickListener {
            startActivity(intent10)
        }

    }


}