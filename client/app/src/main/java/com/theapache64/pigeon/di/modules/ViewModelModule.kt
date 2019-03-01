package com.theapache64.pigeon.di.modules

import androidx.lifecycle.ViewModel
import com.theapache64.pigeon.ui.activities.login.LogInViewModel
import com.theapache64.pigeon.ui.activities.main.MainViewModel
import com.theapache64.pigeon.ui.activities.splash.SplashViewModel
import com.theapache64.twinkill.di.modules.BaseViewModelModule
import com.theapache64.twinkill.utils.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [BaseViewModelModule::class])
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(viewModel: SplashViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(LogInViewModel::class)
    abstract fun bindLogInViewModel(viewModel: LogInViewModel): ViewModel


}