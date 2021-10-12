package com.zidan.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Profil4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anggota4)
        val editTextprofil1 : EditText = findViewById(R.id.editTextTextPersonName4)
        val buttonprofil1 : Button = findViewById(R.id.buttonanggota4)
        val absenprofil1 = "34"

        buttonprofil1.setOnClickListener{
            if (editTextprofil1.length()==0){
                val toast = Toast.makeText(this, "Masukan Absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextprofil1.getText().toString()
                if (inputan==absenprofil1){
                    val toast = Toast.makeText(this, "Nama saya Zidan absen 34", Toast.LENGTH_SHORT)
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

