package com.example.newpedro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    private lateinit var textView : TextView
    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val intent = Intent(this, MainActivity2::class.java)
        textView = findViewById<TextView>(R.id.textView)
        val lista = mutableListOf<Book>()
        val book = Book(intent.getStringExtra("titulo"),intent.getStringExtra("numPaginas"), intent.getStringExtra("nombre"), intent.getStringExtra("fecha") )
        lista.add(book)

        btn = findViewById<Button>(R.id.button3)
        btn.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            val book = Book(intent.getStringExtra("titulo"),intent.getStringExtra("numPaginas"), intent.getStringExtra("nombre"), intent.getStringExtra("fecha") )
            var cont = 0
            lista.forEach {
                textView.text = textView.text.toString() + book.toString()
                intent.putExtra(cont.toString(), it)
                cont++
            }
            intent.putExtra("cant_libros", cont.toString())
            startActivity(intent)
        }
    }


}