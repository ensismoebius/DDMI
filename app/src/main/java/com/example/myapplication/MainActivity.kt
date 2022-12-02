package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculadora: ImageButton = findViewById(R.id.btnCalculadora)
        btnCalculadora.setOnClickListener{
            abrirCalculadora()
        }

    }


    private fun abrirCalculadora(){
        val intencao = Intent(
            this, Calculadora::class.java
        );

        startActivity(intencao);
    }


}