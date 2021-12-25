package com.yusuftalhaklc.akotlinlandmarkbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusuftalhaklc.akotlinlandmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var landMarkList : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landMarkList = ArrayList<LandMark>()

        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colosseum = LandMark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel)
        val londonBridge = LandMark("London Bridge","UK",R.drawable.londonbridge)

        landMarkList.add(pisa)
        landMarkList.add(colosseum)
        landMarkList.add(eiffel)
        landMarkList.add(londonBridge)

        // değeri adapter e taşıyoruz
        val landMarkAdapter = LandMarkAdapter(landMarkList)
        // değerler nasıl gösterilecek *linear ve grid
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        // adapteri tanımlıyoruz en son işlem
        binding.recyclerView.adapter = landMarkAdapter


        /*
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, landMarkList.map { landMark -> landMark.name })
        binding.listView.adapter = adapter
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val intent = Intent(this, DeatilsActivity::class.java)

            intent.putExtra("LandMark",landMarkList.get(position))
            startActivity(intent)
        }*/


    }
}