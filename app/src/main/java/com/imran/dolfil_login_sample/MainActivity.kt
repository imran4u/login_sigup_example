package com.imran.dolfil_login_sample

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(Runnable { // This method will be executed once the timer is over
            startActivity(Intent(this@MainActivity, SignupScreen::class.java))
            finish()
        }, 5000)
    }
}
