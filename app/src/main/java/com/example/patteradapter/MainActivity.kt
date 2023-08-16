package com.example.patteradapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.patteradapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnOnA.setOnClickListener {
                textBombillo.setText(Bombillo_Adapter().setON())
                textNameB.text="Bombillo Adapter (Vela)"
            }
            btnOffA.setOnClickListener {
                textBombillo.setText(Bombillo_Adapter().setOff())
                textNameB.text="Bombillo Adapter (Vela)"
            }
            btnPowerA.setOnClickListener {
                textBombillo.setText(Bombillo_Adapter().setPowerUp())
                textNameB.text="Bombillo Adapter (Vela)"
            }
            btnOnM.setOnClickListener {
                textBombillo.setText(Bombillo_Moderno().setON())
                textNameB.text="Bombillo Moderno"
            }
            btnOffM.setOnClickListener {
                textBombillo.setText(Bombillo_Moderno().setOff())
                textNameB.text="Bombillo Moderno"
            }
            btnPowerM.setOnClickListener {
                textBombillo.setText(Bombillo_Moderno().setPowerUp())
                textNameB.text="Bombillo Moderno"
            }
            btnOnC.setOnClickListener {
                textBombillo.setText(Bonbillo_Clasico().setON())
                textNameB.text="Bombillo Clasico"
            }
            btnOffC.setOnClickListener {
                textBombillo.setText(Bonbillo_Clasico().setOff())
                textNameB.text="Bombillo Clasico"
            }
            btnPowerC.setOnClickListener {
                textBombillo.setText(Bonbillo_Clasico().setPowerUp())
                textNameB.text="Bombillo Clasico"
            }
            btnReiniciarBombillo.setOnClickListener {
                textBombillo.setText("")
                textBombillo.hint="Bombillo"
                textNameB.text=""
            }
        }
    }
}