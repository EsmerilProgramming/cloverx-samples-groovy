package org.esmerilprogramming.overtown_samples_groovy.controller

import org.esmerilprogramming.overtown_samples_groovy.model.Car
import org.esmerilprogramming.overtown_samples_groovy.model.Contact
import org.esmerilprogramming.overtown.annotation.Controller
import org.esmerilprogramming.overtown.annotation.JSONResponse
import org.esmerilprogramming.overtown.annotation.Page
import org.esmerilprogramming.overtown.http.OvertownRequest
import org.esmerilprogramming.overtown.http.JsonResponse

@Controller
class JsonController {

  @Page(value = 'json/form',responseTemplate = 'json.ftl')
  void form() {

  }

  @JSONResponse(rootAttribute = '')
  @Page(value='json/toJson')
  void toJson(Contact contact , OvertownRequest request) {
    println contact
    request.addAttribute('contact', contact)
  }

  @Page('json/car')
  void json(JsonResponse response) {
    Car car = new Car(2004 , 'Honda Fit')
    response.addAttribute('car' , car)
  }

}
