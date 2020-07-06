package com.corap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.corap.onboard.Onboard_1_Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        val fragment = Onboard_1_Fragment()
//        fragmentTransaction.add(R.id.onboard_1_fragment_holder, fragment)
//        fragmentTransaction.commit()
    }
}