package com.example.ejercicio10pedropuerma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ejercicio10pedropuerma.databinding.ActivityObjetoBinding

class Objeto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var cambio: Intent

        binding.recoger.setOnClickListener(){
            if ((personaje1.mochila.getPesoMochila() - articulo.getPeso()) > 0){
                personaje1.mochila.setPesoMochila(personaje1.mochila.getPesoMochila() - articulo.getPeso())
                personaje1.mochila.interior.add(articulo)
                println("Objeto introducido")
                println("Peso de la mochila cambiado")
                cambio = Intent(this, PaginaBlanco::class.java)
                startActivity(cambio)
            }else{
                Toast.makeText(this, "La mochila estas llena, por favor contacta con el mercader", Toast.LENGTH_LONG).show()
            }
        }

        binding.continuarRecoger.setOnClickListener(){
            cambio = Intent(this, MainActivity::class.java)
            startActivity(cambio)
        }
    }
}