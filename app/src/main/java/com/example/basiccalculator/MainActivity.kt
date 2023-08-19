package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPlus.setOnClickListener{
            val input1 = binding.Number1.text.toString().toInt()
            val input2 = binding.Number2.text.toString().toInt()
            binding.ResultView.text = (input1+input2).toString()
        }

        binding.btnMinus.setOnClickListener{
            val input1 = binding.Number1.text.toString().toInt()
            val input2 = binding.Number2.text.toString().toInt()
            binding.ResultView.text = (input1-input2).toString()
        }

        binding.btnMultyply.setOnClickListener {
            val input1 = binding.Number1.text.toString().toInt()
            val input2 = binding.Number2.text.toString().toInt()
            binding.ResultView.text = (input1 * input2).toString()
        }

        binding.btnDivide.setOnClickListener {
            val input1 = binding.Number1.text.toString().toInt()
            val input2 = binding.Number2.text.toString().toInt()
            binding.ResultView.text = (input1 / input2).toString()
        }

        }
}