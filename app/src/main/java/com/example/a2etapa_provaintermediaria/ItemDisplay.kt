package com.example.a2etapa_provaintermediaria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ItemDisplay : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_display)

        fun ChangeScreens()
        {
            val MainActivity= Intent(this,MainActivity::class.java)
            startActivity(MainActivity)
        }


        var Button_GoBack = findViewById<TextView>(R.id.Button_GoBack)
        Button_GoBack.setOnClickListener(){   ChangeScreens()   }







        var _intent = intent.extras

        var ProductName = findViewById<TextView>(R.id.AID_ProductName)
        var ProductDescription = findViewById<TextView>(R.id.AID_ProductDescription)
        var ProductValue = findViewById<TextView>(R.id.AID_ProductValue)

        ProductName.text = _intent?.getString("ProductName")
        ProductDescription.text = _intent?.getString("ProductDescription")
        ProductValue.text = _intent?.getString("ProductValue")



        // intent.putExtra("ProductValue", p.ProductValue)
        // intent.putExtra("ProductDescription", p.ProductDescription)
        // intent.putExtra("ProductName", p.ProductName)


    }
}