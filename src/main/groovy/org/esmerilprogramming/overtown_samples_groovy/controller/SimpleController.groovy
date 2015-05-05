package org.esmerilprogramming.overtown_samples_groovy.controller

import org.esmerilprogramming.overtown.annotation.Controller
import org.esmerilprogramming.overtown.annotation.Page

@Controller
class SimpleController {

  @Page('helloworld')
  void helloWorld() {
    println 'Say hello world for me'
  }

}
