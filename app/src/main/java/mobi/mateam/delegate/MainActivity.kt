package mobi.mateam.delegate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val sharedPref by getSharedPref()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateView(sharedPref.clickCount)

        button.setOnClickListener {
            Log.d("DelegateTest", "OnButtonClicked")
            updateView(++sharedPref.clickCount)
        }
    }

    private fun updateView(newValue: Int) {
        Log.d("DelegateTest", "onClickCountChanged, new value  [$newValue]")
        tvCount.text = "Click counter: $newValue"
    }
}


