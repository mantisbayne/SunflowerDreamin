package com.mobile.meredithbayne.sunflowerdreamin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.meredithbayne.sunflowerdreamin.ui.sunflowerdreamin.SunflowerDreaminFragment

class SunflowerDreaminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sunflower_dreamin_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SunflowerDreaminFragment.newInstance())
                .commitNow()
        }
    }

}
