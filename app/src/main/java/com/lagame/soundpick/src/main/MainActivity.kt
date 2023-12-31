package com.lagame.soundpick.src.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lagame.soundpick.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var itemsData = ArrayList<PickItemsData>()
        var i = 1
        itemsData.add(PickItemsData("오전 9:30 - 오후 17:00 ", "23/12/19 - 23/12/31", true))

        val pickRcvAdapter = PickRcvAdapter(itemsData)
        //binding.

    }
}