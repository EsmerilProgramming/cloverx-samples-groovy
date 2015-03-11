package org.esmerilprogramming.cloverx_samples_groovy.controller

import org.esmerilprogramming.cloverx.annotation.Controller
import org.esmerilprogramming.cloverx.annotation.Page

@Controller
class SimpleController {

  @Page("helloworld")
  void helloWorld() {
    println = "Say hello world for me"
  }

}
