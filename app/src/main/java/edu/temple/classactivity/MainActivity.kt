package edu.temple.classactivity

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.clickme)!!).setOnClickListener{
            (it as Button).text = "Button clicked !!"
        }

//        findViewById<Button>(R.id.clickme)?.run{
//            this.text = "Button clicked 4"
//        }

        //val ocl = OnClickListener { p0 -> (p0 as Button).text = "Button clicked 3" }

    //       clickMeButton = findViewById(R.id.clickme)
    //       clickMeButton.setOnClickListener{clickMeButton.text = "Button clicked!"}



    }
}