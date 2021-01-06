package com.example.madlevel1example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivAnimal.setImageResource(R.drawable.image1)

        btnSubmit.setOnClickListener {
            checkAnswer()
        }
    }

    private fun checkAnswer() {
        val answer = etInput.text.toString()

        val message =
            if (answer == getString(R.string.giraffe) || answer == getString(R.string.giraffe).toLowerCase(
                    Locale.ROOT)) {
                R.string.correct
            } else {
                R.string.incorrect
            }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}