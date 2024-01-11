package com.lagame.soundpick.src.main.delete

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lagame.soundpick.databinding.RcvPicksItemBinding
import com.lagame.soundpick.src.main.PickItemsData

class PickDeleteRcvAdapter(private val itemsData: ArrayList<PickItemsData>) : RecyclerView.Adapter<PickDeleteRcvAdapter.ViewHolder>() {


    // item xml을 받아와 홀더를 만들어준다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PickDeleteRcvAdapter.ViewHolder {
        val binding: RcvPicksItemBinding = RcvPicksItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        // 아이템 레이아웃을 바인딩하여 연결 후 ViewHolder 클래스에 연결해준다.
        return ViewHolder(binding)
    }

    // 바인딩한 데이터를 홀더에 넣어준다.
    override fun onBindViewHolder(holder: PickDeleteRcvAdapter.ViewHolder, position: Int) {
        holder.bind(itemsData[position])
    }

    override fun getItemCount(): Int = itemsData.size

    inner class ViewHolder(private val binding: RcvPicksItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: PickItemsData){
            binding.rcvPicksTvTime.text = data.time
            binding.rcvPicksTvDate.text = data.date
        }
    }
}