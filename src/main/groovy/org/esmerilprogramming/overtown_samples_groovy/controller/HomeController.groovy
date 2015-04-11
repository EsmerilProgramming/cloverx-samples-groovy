package org.esmerilprogramming.overtown_samples_groovy.controller

import org.esmerilprogramming.cloverx.annotation.Controller
import org.esmerilprogramming.cloverx.annotation.Page

@Controller
class HomeController {

  @Page(value = '/', responseTemplate = 'home.ftl')
  void index() {}

}
