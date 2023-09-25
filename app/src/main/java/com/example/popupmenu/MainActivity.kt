 package com.example.popupmenu

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast

 class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.popupMenu)
        val linearLayout=findViewById<LinearLayout>(R.id.LinearLayout)

        button.setOnClickListener {

            val  popupMenu=PopupMenu(this,button)

            popupMenu.menuInflater.inflate(R.menu.popup_menu,popupMenu.menu)

            popupMenu.show()

            popupMenu.setOnMenuItemClickListener {

                when(it.itemId){
                    R.id.red->{

                        Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show()
                        linearLayout.setBackgroundColor(Color.parseColor("#F32727"))

                    }

                    R.id.Green->{

                        Toast.makeText(this, "Green", Toast.LENGTH_SHORT).show()
                        linearLayout.setBackgroundColor(Color.parseColor("#53D51C"))

                    }
                    R.id.blue->{

                        Toast.makeText(this, "Blue", Toast.LENGTH_SHORT).show()
                        linearLayout.setBackgroundColor(Color.parseColor("#2944DD"))

                    }
                }
                true
            }
        }
    }
}