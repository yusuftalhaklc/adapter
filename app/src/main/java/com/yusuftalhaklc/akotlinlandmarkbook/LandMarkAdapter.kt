package com.yusuftalhaklc.akotlinlandmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yusuftalhaklc.akotlinlandmarkbook.databinding.RecyclerviewRowBinding

class LandMarkAdapter(val landmarkList : ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {

    class LandMarkHolder(val binding: RecyclerviewRowBinding ) : RecyclerView.ViewHolder(binding.root) {

    }

    //oluşturulan viewholder ı layout ile bağlama
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : LandMarkHolder {
        //infilate = şişir //parent
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LandMarkHolder(binding)
    }

    //bağlandıktan sonra ne olucak
    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = landmarkList.get(position).name

        // tıklandığında ne olacak
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, DeatilsActivity::class.java)
            intent.putExtra("LandMark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
1
    }


    //kaç tane oluşacak
    override fun getItemCount(): Int {
        return landmarkList.size

    }


}