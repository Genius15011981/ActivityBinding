package com.example.activitybinding

import android.app.Activity
import android.app.Instrumentation.ActivityResult
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.activitybinding.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.doneBtn.setOnClickListener{
        val intent=Intent()
        val age =  binding.ageEt.text.toString()
            intent.putExtra("age",age)
            setResult(Activity.RESULT_OK,intent)
            finish()

        }
    }

    fun txtClear(view: View) {
        val txt=findViewById<EditText>(R.id.ageEt)
        txt.setText("")
    }
}