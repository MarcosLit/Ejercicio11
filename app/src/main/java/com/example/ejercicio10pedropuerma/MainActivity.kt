package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10pedropuerma.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        println(personaje1.nombre)




        binding.imageButton.setOnClickListener(){
            val numeros = 1..4
            val numero = numeros.random().toString()
            var cambio = Intent(this, MainActivity::class.java)
            when(numero){
                "1"->cambio=Intent(this, Ciudad::class.java)
                "2"->cambio=Intent(this, Enemigo::class.java)
                "3"->cambio=Intent(this, Mercader::class.java)
                "4"->cambio=Intent(this, Objeto::class.java)
            }
            startActivity(cambio)
        }

    }
}