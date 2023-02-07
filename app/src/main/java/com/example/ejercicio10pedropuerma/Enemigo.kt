package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10pedropuerma.databinding.ActivityCiudadBinding
import com.example.ejercicio10pedropuerma.databinding.ActivityEnemigoBinding

class Enemigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEnemigoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var cambio = Intent(this, Ciudad::class.java)

        binding.button5.setOnClickListener(){
            cambio = Intent(this, PaginaBlanco::class.java)
            startActivity(cambio)
        }

        binding.button6.setOnClickListener(){
            cambio = Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }
    }
}