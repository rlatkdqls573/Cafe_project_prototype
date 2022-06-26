package com.example.cafe_project_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Edia_f_Activity:  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_edia)

        val intent3= Intent(this, FavoriteActivity::class.java)

        val buttonView3 = findViewById<Button>(R.id.btn_f_eida_back)

        buttonView3.setOnClickListener {
            startActivity(intent3)
        }


    }


}
