package com.lagame.soundpick.src.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lagame.soundpick.R
import com.lagame.soundpick.databinding.ActivityMainBinding
import com.lagame.soundpick.src.main.config.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var itemsData = ArrayList<PickItemsData>()
        var i = 1
        itemsData.add(PickItemsData("오전 9:30 - 오후 17:00 ", "23/12/19 - 23/12/31", true))

        val pickRcvAdapter = PickRcvAdapter(itemsData)
        binding.mainRcvPicks.adapter = pickRcvAdapter
    }
}