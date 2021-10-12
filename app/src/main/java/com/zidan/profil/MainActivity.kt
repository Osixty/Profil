package com.zidan.profil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val button1: Button = findViewById(R.id.button2)
        button1.setOnClickListener{ viewDetail("gunan")}
    val button2: Button = findViewById(R.id.button3)
        button2.setOnClickListener{ viewDetail("rafli")}
    val button3: Button = findViewById(R.id.button4)
        button3.setOnClickListener{ viewDetail("absar")}
    val button4: Button = findViewById(R.id.button5)
        button4.setOnClickListener{ viewDetail("zidan")}
    }

    private fun viewDetail(act: String) {
        val gunan = Intent(this, Profil1Activity::class.java)
        val rafli = Intent(this, Profil2Activity::class.java)
        val absar = Intent(this, Profil3Activity::class.java)
        val zidan = Intent(this, Profil4Activity::class.java)
        when (act) {
            "gunan" -> startActivity(gunan)
            "rafli" -> startActivity(rafli)
            "absar" -> startActivity(absar)
            "zidan" -> startActivity(zidan)
        }
    }
}