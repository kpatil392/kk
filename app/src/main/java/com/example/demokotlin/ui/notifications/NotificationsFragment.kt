package com.example.demokotlin.ui.notifications

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demokotlin.R
import com.example.demokotlin.databinding.FragmentNotificationsBinding
import com.example.mvvmdemokotlin.ui.base.BaseFragment

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>() {

    private lateinit var notificationViewModel: NotificationsViewModel
    private lateinit var binding: FragmentNotificationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun getLayoutRes(): Int {
        return R.layout.fragment_notifications
    }

    override fun onViewCreated(binding: FragmentNotificationsBinding, savedInstanceState: Bundle?) {
        (activity as AppCompatActivity).supportActionBar?.title ="Tanmay Patil"
        binding.textNotifications.setText("Tanmay Patil")


    }
}
