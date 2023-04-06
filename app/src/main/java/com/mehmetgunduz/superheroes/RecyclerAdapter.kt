package com.mehmetgunduz.superheroes

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyler_row.view.*

class RecyclerAdapter(val superHeroList : ArrayList<String>, val heroImages : ArrayList<Int>) : RecyclerView.Adapter<RecyclerAdapter.SuperHeroVH>(){



    class SuperHeroVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroVH {
        //Inflater, LayoutInflater,MenuInflater
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recyler_row,parent,false)
        return SuperHeroVH(itemView)
    }

    override fun onBindViewHolder(holder: SuperHeroVH, position: Int){
        holder.itemView.recyclerViewTextView.text = superHeroList.get(position)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi",superHeroList.get(position))
            intent.putExtra("superKahramanGorseli",heroImages.get(position))

          /*
            val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = heroImages.get(position)
   */
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }
}