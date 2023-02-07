package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10pedropuerma.databinding.ActivityCiudadBinding
import com.example.ejercicio10pedropuerma.databinding.ActivityMainBinding

class Ciudad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCiudadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var cambio = Intent(this, Ciudad::class.java)

        binding.button3.setOnClickListener(){
            cambio = Intent(this, PaginaBlanco::class.java)
            startActivity(cambio)
        }

        binding.button4.setOnClickListener(){
            cambio = Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }
    }
}