package com.example.demokotlin.ui.home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.R
import com.example.demokotlin.databinding.FragmentHomeBinding
import com.example.mvvmdemokotlin.ui.base.BaseFragment

//https://github.com/werbhelius/PickPhotoSample/blob/master/app/src/main/java/com/werb/pickphotosample/MainActivity.kt
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

   
    override fun getLayoutRes(): Int {
       return R.layout.fragment_home
    }
    override fun onViewCreated(binding: FragmentHomeBinding, savedInstanceState: Bundle?) {
        (activity as AppCompatActivity).supportActionBar?.title ="Ishwari Patil"
        binding.textHome.setText("Ishwari Patil")
    }
}
