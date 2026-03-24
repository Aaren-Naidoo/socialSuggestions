package com.example.socialsuggestions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvwelcome  = findViewById<TextView>(R.id.tvWelcomeMain)
        val edttimeofday = findViewById<EditText>(R.id.edtTimeOfDayMain)
        val tvresult   = findViewById<TextView>(R.id.tvMainResult)
        val btnresult  = findViewById<Button>(R.id.btnMainSuggestion)
        val btnremove  = findViewById<Button>(R.id.btnMainClear)


        var sTimeOfday : String
        var sResult : String

        btnresult.setOnClickListener()
        {
            sTimeOfday = edttimeofday.text.toString()
            sResult   =  tvresult.text.toString()

        }





    }
}