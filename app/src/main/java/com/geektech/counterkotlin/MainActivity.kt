package com.geektech.counterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.counterkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnIncrement.setOnClickListener {
                count++
                tvResult.text = count.toString()
            }
            btnDecrement.setOnClickListener {
                count--
                tvResult.text = count.toString()
            }
        }
    }
}