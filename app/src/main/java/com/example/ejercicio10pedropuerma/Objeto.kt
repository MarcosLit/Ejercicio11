package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10pedropuerma.databinding.ActivityObjetoBinding

class Objeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var cambio: Intent

        binding.recoger.setOnClickListener(){
            cambio = Intent(this, PaginaBlanco::class.java)
            startActivity(cambio)
        }

        binding.continuarRecoger.setOnClickListener(){
            cambio = Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }
    }
}