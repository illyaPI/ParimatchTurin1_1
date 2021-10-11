package com.faparimat.mach.com.diturin

import android.content.Context
import com.faparimat.mach.com.importantturin.RepositoryTurin
import com.faparimat.mach.com.repositoryturin.WebViewRepositoryTurin
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModuleTurin(
  private val appContextTurin: Context
) {

  @Provides
  fun provideAppContextTurin(): Context = appContextTurin

  @Provides
  fun provideGsonTurin(): Gson = Gson()

  @Singleton
  @Provides
  fun provideRepositoryTurin(appContextTurin: Context, gsonTurin: Gson): RepositoryTurin = WebViewRepositoryTurin(appContextTurin, gsonTurin)
}