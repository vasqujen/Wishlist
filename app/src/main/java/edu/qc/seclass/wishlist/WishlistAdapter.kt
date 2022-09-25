package edu.qc.seclass.wishlist

import android.app.AlertDialog
import android.content.Context
//import android.service.autofill.WishlistItem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

//import android.view.View
import android.widget.TextView


class WishlistAdapter {
    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Your holder should contain a member variable for any view that will be set as you render
        // a row
        val itemTextView: TextView
        val urlTextView: TextView
        val priceTextView: TextView

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        init {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            itemTextView = itemView.findViewById(R.id.itemTV)
            urlTextView = itemView.findViewById(R.id.urlTV)
            priceTextView = itemView.findViewById(R.id.priceTV)
        }
    }
}



        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishlistAdapter.UserViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val v = inflater.inflate(R.layout.wishlist_item,parent,false)
            return WishlistAdapter.UserViewHolder(v)
        }

        override fun onBindViewHolder(holder: WishlistAdapter.UserViewHolder, position: Int) {
            val newList = userList[position]
            holder.name.text = newList.itemET
            holder.urlName.text = newList.urlET
            holder.priceNum.text = newList.priceET
        }

        override fun getItemCount(): Int {
            return userList.size
        }

