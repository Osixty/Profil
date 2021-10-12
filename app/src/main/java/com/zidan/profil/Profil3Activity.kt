package com.zidan.profil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Profil3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anggota3)

        val editTextprofil3 : EditText = findViewById(R.id.editTextTextPersonName3)
        val buttonprofil3 : Button = findViewById(R.id.buttonanggota3)
        val absenprofil3 = "1"

        buttonprofil3.setOnClickListener{
            if (editTextprofil3.length()==0){
                val toast = Toast.makeText(this, "Masukan Absen", Toast.LENGTH_SHORT)
                toast.show()
            }
            else {
                val inputan = editTextprofil3.getText().toString()
                if (inputan==absenprofil3){
                    val toast = Toast.makeText(this, "Nama saya absar gunan absen 1", Toast.LENGTH_SHORT)
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

