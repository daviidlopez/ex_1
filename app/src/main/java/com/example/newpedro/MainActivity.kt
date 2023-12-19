package com.example.newpedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var titulo : EditText
    private lateinit var numPaginas : EditText
    private lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        titulo = findViewById<EditText>(R.id.editTextText)
        numPaginas = findViewById<EditText>(R.id.editTextText2)
        btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("titulo", titulo.text)
            intent.putExtra("numPaginas", numPaginas.text)
//            var miCont = intent.getStringExtra("cant_libros")!!.toInt()
//            var cont = miCont
//            repeat(miCont){
//                intent.putExtra(cont.toString(), intent.getParcelableExtra(cont.toString()))
//            }
            startActivity(intent)
        }

    }
}