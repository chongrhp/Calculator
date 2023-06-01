package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener{
            var num1:String = binding.editTextNumber1.text.toString()
            var num2:String = binding.editTextNumber2.text.toString()
            if(num1 == "") num1 = "0"
            if(num2 == "") num2 = "0"
            val add:Int = num1.toInt() + num2.toInt()
            binding.textResult.text = "Additition of two numbers: ${add.toString()}"
        }

        binding.btnSubtract.setOnClickListener {
            var num1:String = binding.editTextNumber1.text.toString()
            var num2:String = binding.editTextNumber2.text.toString()
            if(num1 == "") num1 = "0"
            if(num2 == "") num2 = "0"
            val sub:Double = num1.toDouble() - num2.toDouble()
            binding.textResult.text = "Subtraction of two numbers: ${sub.toString()}"
        }

        binding.btnMultiply.setOnClickListener{
            var num1:String = binding.editTextNumber1.text.toString()
            var num2:String = binding.editTextNumber2.text.toString()
            if(num1 == "") num1 = "0"
            if(num2 == "") num2 = "0"
            try {
                val prod: Double = num1.toDouble() * num2.toDouble()
                binding.textResult.text =
                    "Multiplication of two numbers: ${String.format("%2.f", prod)}"
            }catch(e:Exception){
                binding.textResult.text = "error message ${e.message}"
            }

        }

        binding.btnDivide.setOnClickListener{
            var num1:String = binding.editTextNumber1.text.toString()
            var num2:String = binding.editTextNumber2.text.toString()
            if(num1 == "") num1 = "0.0"
            if(num2 == "") num2 = "0.0"
            var div:Double = 0.0
            try {
                div = num1.toDouble() / num2.toDouble()
                binding.textResult.text = "Division of two numbers: ${String.format("%2.f",div)}"
            } catch (e:Exception){
                binding.textResult.text = "error message ${e.message}"
            }
        }
    }
}