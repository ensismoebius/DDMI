package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)


        val igual: Button = findViewById(R.id.btnIgual)
        igual.setOnClickListener {
            val avaliador : EvaluateString = EvaluateString();
            val txtformula : TextView = this.findViewById(R.id.txtFormula);
            val expr: String = txtformula.text.toString()
            txtformula.text = avaliador.evaluate(expr)
        }


    }
}