package com.example.testlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testlifecycle.databinding.ActivityMainBinding
import com.example.testlifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    val TAG = "test"
    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d(TAG, "second : onCreate")
        var view = binding.root
        setContentView(view)
        binding.secondBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "second : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "second : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "second : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "second : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "second : onDestroy")
    }
}