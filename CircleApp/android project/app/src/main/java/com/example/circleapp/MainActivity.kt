package com.example.circleapp

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.circleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    private lateinit var binding: ActivityMainBinding
    private val pi = 3.141592653589793
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setupCalculateButton()
    }
    
    private fun setupCalculateButton() {
        binding.buttonCalculateArea.setOnClickListener {
            calculateCircleArea()
        }
    }
    
    private fun calculateCircleArea() {
        val radiusInput = binding.editTextRadius.text.toString().trim()
        
        // Validate that input is not empty
        if (TextUtils.isEmpty(radiusInput)) {
            showError(getString(R.string.error_empty_field))
            binding.textViewResult.text = ""
            return
        }
        
        // Validate that input is a valid number
        val radius = try {
            radiusInput.toDouble()
        } catch (e: NumberFormatException) {
            showError(getString(R.string.error_invalid_number))
            binding.textViewResult.text = ""
            return
        }
        
        // Validate that radius is positive
        if (radius <= 0) {
            showError(getString(R.string.error_zero_radius))
            binding.textViewResult.text = ""
            return
        }
        
        // Calculate area: pi * r^2
        val area = pi * radius * radius
        
        // Display result with formatting
        val formattedArea = String.format("%.2f", area)
        binding.textViewResult.text = getString(R.string.result_label) + " $formattedArea square units"
        
        // Change text color to indicate success
        binding.textViewResult.setTextColor(ContextCompat.getColor(this, R.color.result_green))
        
        // Clear any previous error state
        binding.editTextRadius.error = null
    }
    
    private fun showError(message: String) {
        binding.editTextRadius.error = message
        binding.textViewResult.setTextColor(ContextCompat.getColor(this, R.color.error_red))
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

