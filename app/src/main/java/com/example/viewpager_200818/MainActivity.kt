package com.example.viewpager_200818

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager_200818.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

lateinit var mMainPagerAdapter :
        MainViewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setValues() {
        mMainPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mMainPagerAdapter

        tabLayout.setupWithViewPager(mainViewPager)
    }

    override fun setupEvents() {


    }





}