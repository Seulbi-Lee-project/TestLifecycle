package com.example.testlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testlifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "test"
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "main : onCreate")
        var view = binding.root
        setContentView(view)
        binding.mainBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "main : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "main : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "main : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "main : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "main : onDestroy")
    }
}