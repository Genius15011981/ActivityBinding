package com.example.activitybinding

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitybinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.secondActivityBtn.setOnClickListener{
            val intent= Intent(this,SecondActivity::class.java)
            startActivityForResult(intent,77)
        }
    }
    override fun onActivityResult(requestCode:Int, resultCode:Int, data:Intent?){
        super.onActivityResult(resultCode,resultCode,data)
        if (requestCode==77&&resultCode==Activity.RESULT_OK){
            val age=data?.getStringExtra("age")
            binding.resultTv.text = age
        }
    }
}