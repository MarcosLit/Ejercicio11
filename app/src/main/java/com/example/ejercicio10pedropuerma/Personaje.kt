package com.example.ejercicio10pedropuerma

val numerosFuerza = 10..15
val numerosDefensa = 1..5

class Personaje {
    var nombre : String = ""
    var fuerza : Int = numerosFuerza.random().toInt()
    var defensa : Int = numerosDefensa.random().toInt()
    var mochila : Mochila = Mochila()
    var vida : Int = 200
    var monedero : Map<Int, Int> = mapOf()

    constructor(nombre : String, fuerza : Int, defensa : Int, mochila: Mochila, vida : Int, monedero : Map<Int, Int>){
        this.nombre=nombre
        this.fuerza=fuerza
        this.defensa=defensa
        this.mochila=mochila
        this.vida=vida
        this.monedero=monedero
    }
}