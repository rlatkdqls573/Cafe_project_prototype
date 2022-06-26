package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BrandActivity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brand)

        val intent1 = Intent(this, StartActivity::class.java)

        val buttonView2 = findViewById<Button>(R.id.btn_back1)

        buttonView2.setOnClickListener {
            startActivity(intent1)
        }
        val intent11= Intent(this, EdiaActivity::class.java)

        val buttonView11 = findViewById<Button>(R.id.btn_edia)

        buttonView11.setOnClickListener {
            startActivity(intent11)
        }

    }


}