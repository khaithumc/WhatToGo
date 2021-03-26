package com.example.wheretogo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.wheretogo.fragment.AccountTabFragment
import com.example.wheretogo.fragment.HomeTabFragment
import com.example.wheretogo.fragment.ImageTabFragment
import com.example.wheretogo.fragment.ReviewTabFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var actionbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionbar = this!!.supportActionBar!!

        bottomNav.setOnNavigationItemSelectedListener(navSelectedListener)

        customActionbar()
    }

    private var navSelectedListener: BottomNavigationView.OnNavigationItemSelectedListener =
        object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                var fragment: Fragment = Fragment()
                when (item.itemId) {
                    R.id.tabHome -> {
                        actionbar.title = "Home"
                        fragment = HomeTabFragment()
                        loadFragment(fragment)
                        return true
                    }
                    R.id.tabReview -> {
                        actionbar.title = "Review"
                        fragment = ReviewTabFragment()
                        loadFragment(fragment)
                        return true
                    }
                    R.id.tabImage -> {
                        actionbar.title = "Image"
                        fragment = ImageTabFragment()
                        loadFragment(fragment)
                        return true
                    }
                    R.id.tabUser -> {
                        actionbar.title = "Account"
                        fragment = AccountTabFragment()
                        loadFragment(fragment)
                        return true
                    }
                }
                return false
            }
        }

    @SuppressLint("RestrictedApi")
    fun customActionbar() {
        actionbar.title = "Where to go ?"
        actionbar.setDefaultDisplayHomeAsUpEnabled(true)
    }

    //????
    private fun loadFragment(fragment: Fragment) {
        var transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}