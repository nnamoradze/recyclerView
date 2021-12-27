package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PersonRecyclerViewAdapter(private val list: List<Person>): RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder>() {

    class PersonViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView: ImageView
        val text: TextView
        val text2: TextView

        init {
            imageView = itemView.findViewById(R.id.imageView)
            text = itemView.findViewById(R.id.textView)
            text2 = itemView.findViewById(R.id.textView2)
        }

        fun setData(person: Person){

            Glide.with(itemView.context)
                .load(person.imageUrl)
                .into(imageView)

            text.text = person.title
            text2.text = person.name



        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {

        val person = list[position]

        holder.setData(person)


    }

    override fun getItemCount() = list.size

}