package org.esmerilprogramming.overtown_samples_groovy.controller

import io.undertow.server.HttpServerExchange
import io.undertow.util.Headers

import org.esmerilprogramming.overtown.annotation.Controller
import org.esmerilprogramming.overtown.annotation.Page
import org.esmerilprogramming.overtown.http.OvertownRequest
import org.esmerilprogramming.overtown.http.OvertownSession
import org.esmerilprogramming.overtown.http.JsonResponse

import org.esmerilprogramming.overtown_samples_groovy.model.Car

import javax.servlet.http.HttpSession

@Controller(path = '/car')
class CarController {

  @Deprecated
  @Page('form')
  void form(OvertownRequest request) {
    HttpServerExchange exchange = request.exchange()
    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, 'text/html')
    exchange.getResponseSender().send('<form action=\'/car/read\' method=\'post\' >'
        + '<label>Year:</label><input name=\'car.year\' />'
        + '<label>Model:</label><input name=\'car.model\' />'
        + '<button type=\'submit\'>Submit</button>'
        + '</form>')

  }

  @Page(value = 'list' , responseTemplate = 'cars/list.ftl')
  void list(OvertownRequest request) {
    request.addAttribute('cars' , getCars(request))
  }

  @Page(value = 'read' , responseTemplate = 'cars/list.ftl')
  void read(Car car, OvertownRequest request) {
    List<Car> cars = getCars(request)
    cars << car
    request.addAttribute('cars' , cars)
  }

  def getCars(OvertownRequest request) {
    List<Car> cars = (List<Car>) request.getSession().getAttribute('carList')
    if(!cars) {
      cars = new ArrayList()
      request.getSession().setAttribute('carList' , cars)
    }
    cars
  }

}
