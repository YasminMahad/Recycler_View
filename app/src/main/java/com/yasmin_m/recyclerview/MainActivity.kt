package com.yasmin_m.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.yasmin_m.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList = Addition(100)
        print(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter= FibonacciSeries(numberList)
    }

    fun Addition(size:Int):List<Int>{
        var list = ArrayList<Int>()
        var t1 = 1
        var t2 = 0
        var n = 0

        while(n <= size) {
          print(t1)
            var sum = t1 + t2
            t1 = t2
            t2 = sum
            n++
            list+=sum
        }
        return list
    }
}