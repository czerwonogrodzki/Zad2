package com.pam.zad2.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.pam.zad2.R
import com.pam.zad2.databinding.ActivityMainBinding
import com.pam.zad2.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]

        binding.calculate.setOnClickListener {
            val num1 = binding.num1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.num2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculate(num1, num2)
            binding.sum.text = "${result.sum}"
         }


    }
}