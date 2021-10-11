package com.faparimat.mach.com.diturin

import com.faparimat.mach.com.importantturin.applicationturin.WebViewApplicationTurin
import com.faparimat.mach.com.repositoryturin.activitiesturin.LoadingActivityTurin
import com.faparimat.mach.com.repositoryturin.activitiesturin.WebViewActivityTurin
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModuleTurin::class])
interface AppComponentTurin {

  fun injectTurin(applicationTurin: WebViewApplicationTurin)
  fun injectTurin(activityTurin: LoadingActivityTurin)
  fun injectTurin(activityTurin: WebViewActivityTurin)
}