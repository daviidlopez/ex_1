package com.example.newpedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    private lateinit var nombre : EditText
    private lateinit var fecha : EditText
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nombre = findViewById<EditText>(R.id.editTextText2)
        fecha = findViewById<EditText>(R.id.editTextText3)
        btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener() {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("titulo", intent.getStringExtra("titulo"))
            intent.putExtra("numPaginas", intent.getStringExtra("numPaginas"))
            intent.putExtra("nombre", nombre.text)
            intent.putExtra("fecha", fecha.text)
            startActivity(intent)
        }
    }
}