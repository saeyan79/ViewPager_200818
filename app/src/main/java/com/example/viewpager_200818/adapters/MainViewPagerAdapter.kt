package com.example.viewpager_200818.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpager_200818.fragments.AddressFragment
import com.example.viewpager_200818.fragments.NameFragment
import com.example.viewpager_200818.fragments.PhoneNumFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        //charsequence는 string이랑 비슷한거구나 생각하면 됨

            return when (position)
            {
                0 -> "NAME"
                1 -> "PHONE"
                else -> "Addr"
            }
    }


    override fun getItem(position: Int): Fragment {

        return when(position) {
            0 -> NameFragment()
            1 -> PhoneNumFragment()
            else -> AddressFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}