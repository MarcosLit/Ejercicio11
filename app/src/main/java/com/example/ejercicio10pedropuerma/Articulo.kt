package com.example.ejercicio10pedropuerma

class Articulo {
    var peso : Int = 60
    var valor : Int = 10
    var vida : Int = 20


    @JvmName("getValor1")
    fun getValor(): Int{
        return valor
    }

    @JvmName("getPeso1")
    fun getPeso(): Int{
        return peso
    }

    @JvmName("getVida1")
    fun getVida(): Int{
        return vida
    }
}