package com.yusuftalhaklc.akotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.yusuftalhaklc.akotlinlandmarkbook.databinding.ActivityDeatilsBinding
import com.yusuftalhaklc.akotlinlandmarkbook.databinding.ActivityMainBinding

class DeatilsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDeatilsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDeatilsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        //casting
        val selectedLandMark = intent.getSerializableExtra("LandMark") as LandMark

        binding.cityName.text = selectedLandMark.name
        binding.countryName.text = selectedLandMark.country
        binding.imageView.setImageResource(selectedLandMark.image)


    }
}