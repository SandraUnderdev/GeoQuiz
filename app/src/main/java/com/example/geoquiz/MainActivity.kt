package com.example.geoquiz

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val linearLayout: LinearLayout = findViewById(R.id.linear)

        trueButton = findViewById(R.id.btn_true)
        falseButton = findViewById(R.id.btn_false)


        trueButton.setOnClickListener {
          //  Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
            Snackbar.make(linearLayout,  R.string.correct_toast, Toast.LENGTH_SHORT).show()
        }

        falseButton.setOnClickListener {
           // Toast.makeText(this,  R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
           Snackbar.make(linearLayout,  R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        }

    }
}