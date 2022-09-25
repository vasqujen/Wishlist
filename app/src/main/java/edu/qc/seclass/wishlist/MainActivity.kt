package edu.qc.seclass.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.LayoutInflater
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AlertDialog
import edu.qc.seclass.wishlist.WishlistItem
import edu.qc.seclass.wishlist.WishlistAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var addsBtn:FloatingActionButton
    private lateinit var recy:RecyclerView
    private lateinit var userList:ArrayList<WishlistItem>
    private lateinit var wishlistAdapter:WishlistAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set List
        userList= ArrayList()

        //Find views
        addsBtn = findViewById(R.id.addsBtn)
        recy = findViewById(R.id.wishlistRv)

        //Set Adapter
        wishlistAdapter = WishlistAdapter(this, userList)
        //Set recycler view adapter
        recy.layoutManager = LinearLayoutManager(this)
        recy.adapter = wishlistAdapter
        //Set button to do actions
        addsBtn.setOnClickListener { addInfo() }


    }

    private fun addInfo() {
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.activity_main, null)
        val itemName = v.findViewById<EditText>(R.id.itemET)
        val urlName = v.findViewById<EditText>(R.id.urlET)
        val priceNum = v.findViewById<EditText>(R.id.priceET)

        setContentView(v)
        val names = itemName.text.toString()
        val urlnames = urlName.text.toString()
        val pricenums = priceNum.text.toString()
        userList.add(WishlistItem("Name: $names","URL: $urlnames", "Price: $pricenums" )
        //wishlistAdapter.notifyDataSetChanged()
    }
}