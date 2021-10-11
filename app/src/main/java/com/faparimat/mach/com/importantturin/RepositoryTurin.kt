package com.faparimat.mach.com.importantturin

import com.faparimat.mach.com.importantturin.modelsturin.BinomLinkTurin

interface RepositoryTurin {

  var binomLinkTurin: BinomLinkTurin?
  var whiteBaseTurin: String
  var blackBaseTurin: String?
  var defaultKeyTurin: String

  var lastBinomLinkTurin: String?
}