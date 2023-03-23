package com.muiz.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muiz.myapplication.R
import com.muiz.myapplication.data.Country
import com.squareup.picasso.Picasso

class CountriesAdapter(private val countries: List<Country>): RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {

    inner class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameView: TextView = itemView.findViewById(R.id.name)
        val capitalView: TextView = itemView.findViewById(R.id.capital)
        val flagImageView: ImageView = itemView.findViewById(R.id.flag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country, parent, false)
        return CountriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        val country = countries[position]
        holder.nameView.text = country.name
        holder.capitalView.text = country.capital
        Picasso.get().load(country.flag.url).into(holder.flagImageView)
        holder.flagImageView.contentDescription = country.flag.description

        holder.itemView.setOnClickListener {
            // go to country activity
        }
    }

    override fun getItemCount(): Int {
        return  countries.size
    }
}