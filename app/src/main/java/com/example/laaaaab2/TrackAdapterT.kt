package com.example.laaaaab2ab2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.laaaab2.R
import com.example.laab2.FragmentFirstT
import com.example.laab2.trackT


class TrackAdapterT(
    val fragment: FragmentFirstT,
    var trackTS: ArrayList<trackT>, val listner: Listener
) : androidx.recyclerview.widget.RecyclerView.Adapter<TrackAdapterT.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) : androidx.recyclerview.widget.RecyclerView.ViewHolder(itemView) {

        var textViewlName: TextView = itemView.findViewById(R.id.name)
        var textViewautor: TextView = itemView.findViewById(R.id.autor)
        var image: ImageView = itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.animal_card, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return trackTS.size
    }


    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            listner.onClick(position)
        }

        Glide.with(fragment)
            .load(trackTS.get(position).image).fitCenter().into(holder.image)
        holder.textViewlName.text = trackTS.get(position).name
        holder.textViewautor.text = trackTS.get(position).autor
    }

    interface Listener {
        fun onClick(itemView: Int)
    }
}