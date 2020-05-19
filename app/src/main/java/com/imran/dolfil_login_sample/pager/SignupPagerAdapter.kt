package com.imran.dolfil_login_sample.pager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.imran.dolfil_login_sample.R

/**
 * Created by imran on 2020-05-19.
 */
class SignupPagerAdapter(val size:Int):  PagerAdapter() {
    /**
     * Determines whether a page View is associated with a specific key object
     * as returned by [.instantiateItem]. This method is
     * required for a PagerAdapter to function properly.
     *
     * @param view Page View to check for association with `object`
     * @param object Object to check for association with `view`
     * @return true if `view` is associated with the key object `object`
     */
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as View
    }

    /**
     * Return the number of views available.
     */
    override fun getCount(): Int {
      return 2
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//         Get the view from pager page layout
        var view : View ? = null
        val layoutInflater = LayoutInflater.from(container?.context)
        view = if(position==0) {
            layoutInflater.inflate(R.layout.signu_name, container, false)
        }else{
            layoutInflater.inflate(R.layout.signu_email, container, false)
        }
        container?.addView(view)
        // Return the view
        return view
    }

    override fun destroyItem(parent: ViewGroup, position: Int, `object`: Any) {
        // Remove the view from view group specified position
        parent.removeView(`object` as View)
    }


}
