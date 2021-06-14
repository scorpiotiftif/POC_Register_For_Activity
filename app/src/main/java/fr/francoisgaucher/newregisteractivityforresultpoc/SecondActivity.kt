package fr.francoisgaucher.newregisteractivityforresultpoc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        findViewById<TextView>(R.id.validate_action).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }
}