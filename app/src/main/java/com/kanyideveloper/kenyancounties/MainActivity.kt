package com.kanyideveloper.kenyancounties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.kanyideveloper.kenyan_counties.Kenya
import com.kanyideveloper.kenyancounties.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter: CountyRecyclerAdapter by lazy { CountyRecyclerAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Attaching Counties to Spinner
        val arrayAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Kenya.counties())
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = arrayAdapter

        // Getting a County Name by it Code
        binding.textViewCountyName.text = Kenya.getCountyName("001")

        // Getting a Counties Code from its Name
        binding.textViewCountyCode.text = Kenya.getCountyCode("Nairobi")


        // Getting CountName and CountyCode and displaying them in a RecyclerView
        adapter.submitList(Kenya.countiesWithCodes())
        binding.countiesAndCodesRecyclerview.adapter = adapter

    }
}