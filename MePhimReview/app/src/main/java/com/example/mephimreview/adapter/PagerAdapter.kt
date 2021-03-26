package com.example.mephimreview.adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.mephimreview.fragment.FragmentHome
import com.example.mephimreview.fragment.FragmentImage
import com.example.mephimreview.fragment.FragmentMember

class PagerAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHome()
            1 -> FragmentImage()
            else -> FragmentMember()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Home"
            1 -> "Image"
            else -> "Member"
        }
    }
}