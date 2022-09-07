package com.example.chapt3topic5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter (val listprovisi: ArrayList<rumahadat> ) :RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var provinsi = view.findViewById<TextView>(R.id.province)
        var ibukota = view.findViewById<TextView>(R.id.ibukota)
        var image = view.findViewById<ImageView>(R.id.image)
    }
//  view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        TODO("Not yet implemented")
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        TODO("Not yet implemented")
        holder.provinsi.text = listprovisi[position].nama
        holder.ibukota.text = listprovisi[position].ibukota
        holder.image.setImageResource(listprovisi[position].image)

    }

    override fun getItemCount(): Int {
//        TODO("Not yet implemented")
        return listprovisi.size
    }
}