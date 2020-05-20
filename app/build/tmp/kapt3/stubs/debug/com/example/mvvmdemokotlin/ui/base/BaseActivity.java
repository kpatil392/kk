package com.example.mvvmdemokotlin.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H%J\u0014\u0010\u0015\u001a\u00020\u00162\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001c\u0010\u0007\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0019"}, d2 = {"Lcom/example/mvvmdemokotlin/ui/base/BaseActivity;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mViewModel", "getMViewModel", "()Landroidx/lifecycle/ViewModel;", "setMViewModel", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/lifecycle/ViewModel;", "getLayoutRes", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseActivity<DB extends androidx.databinding.ViewDataBinding, VM extends androidx.lifecycle.ViewModel> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    protected DB mBinding;
    @org.jetbrains.annotations.NotNull()
    protected VM mViewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final DB getMBinding() {
        return null;
    }
    
    protected final void setMBinding(@org.jetbrains.annotations.NotNull()
    DB p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getMViewModel() {
        return null;
    }
    
    protected final void setMViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @androidx.annotation.LayoutRes()
    protected abstract int getLayoutRes();
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseActivity() {
        super();
    }
}