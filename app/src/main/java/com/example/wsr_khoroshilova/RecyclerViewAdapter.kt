package com.example.wsr_khoroshilova

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class My : RecyclerView.Adapter<My.Companion.MyRecyclerView>() {

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
    companion object{
        class MyRecyclerView(Item: View): RecyclerView.ViewHolder(Item) {
            var textView = Item.findViewById<TextView>(R.id.textView)
            var like = Item.findViewById<Button>(R.id.like)
            var disslike = Item.findViewById<Button>(R.id.disslike)
            var context= Item.context
            fun onBind(jokeGenerate: JokeGenerate)
            {
                textView.text = jokeGenerate.value.joke
                like.setOnClickListener {
Log.d("like", "Clicked_button_like")
                    val clipboard : ClipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                    clipboard.setPrimaryClip(ClipData.newPlainText("", item.joke))
                    Toast.makeText(context, R.string., )
                }
                disslike.setOnClickListener{

                }

            }
        }

    }
}