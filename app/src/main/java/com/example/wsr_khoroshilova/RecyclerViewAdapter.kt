package com.example.wsr_khoroshilova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class My : RecyclerView.Adapter<My.MyRecyclerView>() {

var jokeList = mutableListOf<JokeGenerate>()

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  MyRecyclerView {
       val View = LayoutInflater.from(parent.context)
           .inflate(R.layout.activity_main3, parent, false)
       // set the view's size, margins, paddings and layout parameters

       return MyRecyclerView(View)
   }

    override fun getItemCount(): Int {
        return jokeList.size
    }

    override fun onBindViewHolder(holder:  MyRecyclerView, position: Int) {

    }
    class MyRecyclerView(Item: View): RecyclerView.ViewHolder(Item) {

       fun onBind() {

        }
    }
}