package org.esmerilprogramming.cloverx_samples_groovy.controller

import org.esmerilprogramming.cloverx_samples_groovy.model.Car
import org.esmerilprogramming.cloverx_samples_groovy.model.Contact
import org.esmerilprogramming.cloverx.annotation.Controller
import org.esmerilprogramming.cloverx.annotation.JSONResponse
import org.esmerilprogramming.cloverx.annotation.Page
import org.esmerilprogramming.cloverx.http.CloverXRequest
import org.esmerilprogramming.cloverx.http.JsonResponse

@Controller
class JsonController {

  @Page(value = "json/form",responseTemplate = "json.ftl")
  void form() {

  }

  @JSONResponse(rootAttribute = "")
  @Page(value="json/toJson")
  void toJson(Contact contact , CloverXRequest request) {
    println contact
    request.addAttribute("contact", contact)
  }

  @Page("json/car")
  void json(JsonResponse response) {
    Car car = new Car(2004 , "Honda Fit")
    response.addAttribute("car" , car)
  }

}
