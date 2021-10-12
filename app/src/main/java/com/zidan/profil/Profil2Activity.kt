package com.zidan.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Profil2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anggota2)

        val editTextprofil2 : EditText = findViewById(R.id.editTextTextPersonName2)
        val buttonprofil2 : Button = findViewById(R.id.buttonanggota2)
        val absenprofil2 = "28"

        buttonprofil2.setOnClickListener{
            if (editTextprofil2.length()==0){
                val toast = Toast.makeText(this, "Masukan Absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextprofil2.getText().toString()
                if (inputan==absenprofil2){
                    val toast = Toast.makeText(this, "Nama saya Rafli absen 28", Toast.LENGTH_SHORT)
                    toast.show()
                }
                else {
                    val toast = Toast.makeText(this, "Absen salah", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }

}

