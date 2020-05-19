package com.imran.dolfil_login_sample

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.imran.dolfil_login_sample.pager.SignupPagerAdapter
import kotlinx.android.synthetic.main.activity_signu_screen.*

class SignupScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signu_screen)
        viewPager.adapter = SignupPagerAdapter(2)
        btn_continue.setOnClickListener {
            if (btn_continue.text.toString() == "CONTINUE") {
                btn_continue.text = "PREVIOUS"
                viewPager.setCurrentItem(1, true)
            } else {
                btn_continue.text = "CONTINUE"
                viewPager.setCurrentItem(0, true)
            }
        }

        btn_college.setOnClickListener {
            val toast = Toast.makeText(this, "Start college", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
        btn_tution.setOnClickListener {
            val toast = Toast.makeText(this, "Start Free Tutuion", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
        btn_ias.setOnClickListener {
            val toast = Toast.makeText(this, "Start free IAS classes ", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }
        btn_school.setOnClickListener {
            val toast = Toast.makeText(this, "Good to see you in free school", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }

    }
}
