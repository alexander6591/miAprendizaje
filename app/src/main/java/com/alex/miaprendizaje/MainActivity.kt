package com.alex.miaprendizaje

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.alex.miaprendizaje.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var num = 1
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.boxOne.setOnClickListener() {
            binding.selectBox.text = binding.boxOne.text

        }
        binding.box2.setOnClickListener() {
            binding.selectBox.text = binding.box2.text

        }

        binding.box3.setOnClickListener() {
            binding.selectBox.text = binding.box3.text

        }
        binding.box4.setOnClickListener() {
            binding.selectBox.text = binding.box4.text

        }
        binding.box5.setOnClickListener() {
            binding.selectBox.text = binding.box5.text

        }
        binding.box6.setOnClickListener() {
            binding.selectBox.text = binding.box6.text

        }
        binding.btnNext.setOnClickListener {
            if (num in 1..5) {
                num += 1
                changeColor(num)
            }

        }
        binding.btnBack.setOnClickListener {
            if (num in 2..6) {
                num -= 1
                changeColor(num)
            }

        }
        binding.btnAceptar.setOnClickListener {
            when (binding.selectBox.text) {
                "Box 1" -> color(binding.boxOne, num)


                "Box 2"

                -> color(binding.box2, num)

                "Box 3"

                -> color(binding.box3, num)

                "Box 4"

                -> color(binding.box4, num)

                "Box 5"

                -> color(binding.box5, num)

                "Box 6"

                -> color(binding.box6, num)
            }
        }

    }

    fun changeColor(i: Int) {
        when (i) {
            1 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Rojo))
            2 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Naranja))
            3 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Amarillo))
            4 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Verde))
            5 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Morado))
            6 -> binding.CVColor.setBackgroundColor(ContextCompat.getColor(this, R.color.Gris))

        }

    }

    fun color(view: View, i: Int) {
        when (i) {
            1 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Rojo))
            2 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Naranja))
            3 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Amarillo))
            4 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Verde))
            5 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Morado))
            6 -> view.setBackgroundColor(ContextCompat.getColor(this, R.color.Gris))

        }
    }

}