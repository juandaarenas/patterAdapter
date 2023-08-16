package com.example.patteradapter

class Bonbillo_Clasico:Bombillo {

    override fun setON(): String {
        val on="Encendido clasico"
        return on
    }

    override fun setOff(): String {
        val off="Apagado clasico"
        return off
    }

    override fun setPowerUp(): String {
        val powerUp="Aumento su luz clasico"
        return powerUp
    }
}