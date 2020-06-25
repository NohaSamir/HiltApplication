package com.noha.hiltapplication.hilt

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Singleton


//ToDo 2 : Create A Hilt module class that is annotated with @Module.
@Module

//ToDo 3: you must annotate Hilt modules with @InstallIn to tell Hilt which Android class each module will be used or installed in
// we will use it inside our fragment and so you can add @InstallIn(FragmentComponent::class)
@InstallIn(FragmentComponent::class)
class HiltModule {

    //@Singleton
    // add it to create one single instance but to do that you must change
    // FragmentComponent to ApplicationComponent
    // @ActivityContext to @ApplicationContext

    //ToDo 4 : Provide Glide RequestManager
    @Provides
    fun provideGlide(@ActivityContext context: Context): RequestManager = Glide.with(context)

}