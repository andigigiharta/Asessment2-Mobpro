package com.codingformobile.calculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import com.codingformobile.calculator.databinding.ActivityHistoryBinding

class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val historyList = intent.getStringArrayListExtra("historyList")

        historyList?.let {
            for (historyItem in it) {
                val textView = TextView(this)
                textView.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                textView.text = historyItem
                textView.setTextSize(16f)

                binding.historyLayout.addView(textView)

                supportActionBar!!.setDisplayHomeAsUpEnabled(true)
                supportActionBar!!.title = "history"

                }
            }
    }
}