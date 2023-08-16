package com.example.patteradapter

class Bombillo_Adapter:Bombillo{

    override fun setON(): String {
        val on = Vela().onFire
        return on
    }

    override fun setOff(): String {
        val off = Vela().offFire
        return off
    }

    override fun setPowerUp(): String {
        val powerUp = Vela().powerFire
        return powerUp
    }
}