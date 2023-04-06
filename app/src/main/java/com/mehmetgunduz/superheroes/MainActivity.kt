package com.mehmetgunduz.superheroes

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var superHeroNames = ArrayList<String>()

        superHeroNames.add("Aquaman")
        superHeroNames.add("Batman")
        superHeroNames.add("Spiderman")
        superHeroNames.add("Ironman")


        //Verimsiz görsel tanımlama

            /*
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aquaman)
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)

        var superHeroImage = ArrayList<Bitmap>()

        superHeroImage.add(aquamanBitmap)
        superHeroImage.add(batmanBitmap)
        superHeroImage.add(spidermanBitmap)
        superHeroImage.add(ironmanBitmap)
*/

        val aquamanDrawableId = R.drawable.aquaman
        val batmanDrawableId = R.drawable.batman
        val spidermanDrawableId = R.drawable.spiderman
        val ironmanDrawableId = R.drawable.ironman

        var superHeroDrawableList = ArrayList<Int>()
        superHeroDrawableList.add(aquamanDrawableId)
        superHeroDrawableList.add(batmanDrawableId)
        superHeroDrawableList.add(spidermanDrawableId)
        superHeroDrawableList.add(ironmanDrawableId)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superHeroNames,superHeroDrawableList)
        recyclerView.adapter = adapter
    }
}