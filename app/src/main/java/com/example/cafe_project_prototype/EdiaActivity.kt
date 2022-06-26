package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EdiaActivity :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edia)

        val intent3= Intent(this, BrandActivity::class.java)

        val buttonView3 = findViewById<Button>(R.id.btn_edia_back)

        buttonView3.setOnClickListener {
            startActivity(intent3)
        }



    }


}