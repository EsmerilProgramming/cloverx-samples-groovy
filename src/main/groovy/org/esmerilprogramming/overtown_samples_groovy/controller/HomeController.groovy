package org.esmerilprogramming.overtown_samples_groovy.controller

import org.esmerilprogramming.overtown.annotation.Controller
import org.esmerilprogramming.overtown.annotation.Page

@Controller
class HomeController {

  @Page(value = '/', responseTemplate = 'home.ftl')
  void index() {}

}
