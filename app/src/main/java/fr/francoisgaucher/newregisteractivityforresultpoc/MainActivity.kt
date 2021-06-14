package fr.francoisgaucher.newregisteractivityforresultpoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        when (result.resultCode) {
            RESULT_OK -> {

                Toast.makeText(applicationContext, "OK", Toast.LENGTH_SHORT).show()
            }
            RESULT_CANCELED -> {
                Toast.makeText(applicationContext, "CANCELED", Toast.LENGTH_SHORT).show()
            }
            else -> {
                Toast.makeText(applicationContext, "ELSE", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.navigate_to_second)?.setOnClickListener {
            activityResultLauncher.launch(Intent(applicationContext,SecondActivity::class.java))
        }
    }

}