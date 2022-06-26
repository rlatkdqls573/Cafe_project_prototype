package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, StartActivity::class.java)

        val buttonView = findViewById<Button>(R.id.btn_login)

        buttonView.setOnClickListener {
            startActivity(intent)
        }

    }


}

