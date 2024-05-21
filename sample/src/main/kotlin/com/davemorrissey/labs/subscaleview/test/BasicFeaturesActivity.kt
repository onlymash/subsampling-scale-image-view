package com.davemorrissey.labs.subscaleview.test

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.davemorrissey.labs.subscaleview.test.databinding.PagesActivityBinding

class BasicFeaturesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        val binding = PagesActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        actionBar?.title = getString(R.string.basic_title)
        binding.imageView.setImage("/android_asset/sanmartino.jpg")
    }
}
