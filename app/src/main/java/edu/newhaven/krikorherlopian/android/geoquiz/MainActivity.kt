package edu.newhaven.krikorherlopian.android.geoquiz

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val TAG = "GeoQuiz"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton.setOnClickListener {
            Toast.makeText(this@MainActivity, R.string.correct, Toast.LENGTH_SHORT).show()
            Log.d(TAG, resources.getString(R.string.clicked_true_button))
        }
        falseButton.setOnClickListener {
            Toast.makeText(this@MainActivity, R.string.incorrect, Toast.LENGTH_SHORT).show()
            Log.d(TAG, resources.getString(R.string.clicked_false_button))
        }
    }
}
