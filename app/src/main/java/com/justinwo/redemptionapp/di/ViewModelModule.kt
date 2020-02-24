package com.justinwo.redemptionapp.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.justinwo.redemptionapp.ui.PhotoViewModel
import com.justinwo.redemptionapp.viewmodel.RedemptionViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PhotoViewModel::class)
    abstract fun bindPhotoViewModel(photoViewModel: PhotoViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: RedemptionViewModelFactory): ViewModelProvider.Factory
}