package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10pedropuerma.databinding.ActivityCiudadBinding
import com.example.ejercicio10pedropuerma.databinding.ActivityMercaderBinding

class Mercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var cambio = Intent(this, Mercader::class.java)

        binding.comerciar.setOnClickListener(){
            cambio = Intent(this, PaginaBlanco::class.java)
            startActivity(cambio)
        }

        binding.continuarComercio.setOnClickListener(){
            cambio = Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }
    }
}