package com.example.mvvmdemokotlin.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import dagger.android.AndroidInjection


abstract class BaseActivity<DB : ViewDataBinding, VM : ViewModel> : AppCompatActivity() {
    protected lateinit var mBinding: DB
    protected lateinit var mViewModel: VM

    @LayoutRes
    protected abstract fun getLayoutRes(): Int

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
       // performDependencyInjection()
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, getLayoutRes())

    }

   /* private fun performDependencyInjection() {
        AndroidInjection.inject(this)
    }*/
}