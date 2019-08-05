package com.com.starter_project.ui.home

import dagger.Module
import dagger.Provides
import com.com.starter_project.di.qualifiers.ViewModelInjection
import com.com.starter_project.di.InjectionViewModelProvider

@Module
class HomeModule {

    @Provides
    @ViewModelInjection
    fun provideHomeVM(
        fragment: HomeFragment,
        viewModelProvider: InjectionViewModelProvider<HomeVM>
    ) = viewModelProvider.get(fragment, HomeVM::class)
}