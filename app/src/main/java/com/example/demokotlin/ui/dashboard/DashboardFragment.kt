package com.example.demokotlin.ui.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.R
import com.example.demokotlin.databinding.FragmentDashboardBinding
import com.example.mvvmdemokotlin.ui.base.BaseFragment

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {

    private lateinit var dashboardViewModel: DashboardViewModel
    override fun getLayoutRes(): Int {
        return R.layout.fragment_dashboard
    }

    override fun onViewCreated(binding: FragmentDashboardBinding, savedInstanceState: Bundle?) {
        (activity as AppCompatActivity).supportActionBar?.title ="Pratyush Patil"
        binding.textDashboard.setText("Pratyush Patil")
    }

}
