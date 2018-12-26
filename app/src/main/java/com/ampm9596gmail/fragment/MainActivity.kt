package com.ampm9596gmail.fragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      var fManager=supportFragmentManager
        home.setOnClickListener {
            var tx=fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        bujji.setOnClickListener {
            var tx=fManager.beginTransaction()
            tx.replace(R.id.frag1,BujjiFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        hem.setOnClickListener {
            var tx=fManager.beginTransaction()
            tx.replace(R.id.frag1,HemanthFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        con.setOnClickListener {
            var tx=fManager.beginTransaction()
            tx.replace(R.id.frag1,contactFragment())
            tx.addToBackStack("true")
            tx.commit()
        }


    }//onCreate
}
