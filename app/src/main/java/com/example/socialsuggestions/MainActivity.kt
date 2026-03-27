package com.example.socialsuggestions

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
            // setting up vals constant
        val tvwelcome = findViewById<TextView>(R.id.tvWelcomeMain)
        val edttimeofday = findViewById<EditText>(R.id.edtTimeOfDayMain)
        val tvresult = findViewById<TextView>(R.id.tvMainResult)
        val btnresult = findViewById<Button>(R.id.btnMainSuggestion)
        val btnremove = findViewById<Button>(R.id.btnMainClear)

//varible
        var sTimeOfday: String


        // when button is clciked
        btnresult.setOnClickListener()
        {

            // gets the input from edt and ingrones case
            sTimeOfday = edttimeofday.text.toString().trim().lowercase()

            // checks if input is empty
            if (sTimeOfday == "") {
                // displays message if input is wrong
                Toast.makeText(this, "Input Cannot Be Blank Enter A Time Of Day!", Toast.LENGTH_LONG).show()


            } else if (sTimeOfday.any { it.isDigit() }) {
                    Toast.makeText(this, "Input Can't Have Numbers!", Toast.LENGTH_SHORT).show()
                }

                // checks if input = morning
             else if (sTimeOfday == "morning") {
                //displays suggestion
                tvresult.text = "Send a good morning text to a family member "

                // checks if input = mid-morning
            } else if (sTimeOfday == "mid-morning") {
                // displays suggestion
                tvresult.text = "Reach out to colleague with a quick thank you "

                //checcks if input = afternoon
            } else if (sTimeOfday == "afternoon") {
                // displays suggestion
                tvresult.text = "Send a funny meme or intresting link with a freind"

                // checks input = Snack time
            } else if (sTimeOfday == "afternoon snack time") {
                //displays suggestion
                tvresult.text = "Send a quick thinking of you message"

                // checks if input = dinner
            } else if (sTimeOfday == "dinner") {
                // displays suggestion
                tvresult.text = "Call a freind or relative for a quick chat"

                // checks input = night
            } else if (sTimeOfday == "night") {
                // displays suggestion
                tvresult.text = "Leave a thoughtful comment on a friend's post"


                // checks input = night
            } else if (sTimeOfday == "after dinner") {
                // displays suggestion
                tvresult.text = "Leave a thoughtful comment on a friend's post"


                // if input does not equal the suggestions then
            } else {
                Toast.makeText(this, "Please check you are entering a valid input", Toast.LENGTH_SHORT).show()
            }

        }
            btnremove.setOnClickListener {
                edttimeofday.text.clear()
                tvresult.text = "Your Suggestion will appear here"
                Toast.makeText(this, "Text Cleared", Toast.LENGTH_SHORT).show()



        }


    }
}