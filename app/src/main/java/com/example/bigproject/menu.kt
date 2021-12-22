package com.example.bigproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.bigproject.Fragment.*
import kotlinx.android.synthetic.main.activity_menu.*

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val ProfileFragment = ProfileFragment()
        val PrivasiFragment = PrivasiFragment()
        val RekapFragment = RekapFragment()
        val AboutFragment = AboutFragment()

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawer_layout, toolbar, R.string.nav_drawer_open, R.string.nav_drawer_open)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.profile ->  makeCurrentFragment(ProfileFragment)
                R.id.security ->  makeCurrentFragment(PrivasiFragment)
                R.id.log ->  makeCurrentFragment(RekapFragment)
                R.id.aboutApp ->  makeCurrentFragment(AboutFragment)
            }
            true
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)){
            drawer_layout.closeDrawer(GravityCompat.START)
        } else{
            super.onBackPressed()
        }
    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
    }
}