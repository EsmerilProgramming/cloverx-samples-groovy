package org.esmerilprogramming.cloverx_samples_groovy.controller

import io.undertow.server.HttpServerExchange
import io.undertow.util.Headers

import org.esmerilprogramming.cloverx.annotation.Controller
import org.esmerilprogramming.cloverx.annotation.Page
import org.esmerilprogramming.cloverx.http.CloverXRequest
import org.esmerilprogramming.cloverx.http.CloverXSession
import org.esmerilprogramming.cloverx.http.JsonResponse
import org.jboss.logging.Logger

import org.esmerilprogramming.cloverx_samples_groovy.model.Car

import javax.servlet.http.HttpSession
import java.util.ArrayList
import java.util.List

@Controller(path = "/car")
class CarController {

  private static final Logger LOGGER = Logger.getLogger(CarController)

  @Deprecated
  @Page("form")
  void form(CloverXRequest request) {
    HttpServerExchange exchange = request.exchange()
    exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html")
    exchange.getResponseSender().send("<form action='/car/read' method='post' >"
        + "<label>Year:</label><input name='car.year' />"
        + "<label>Model:</label><input name='car.model' />"
        + "<button type='submit'>Submit</button>"
        + "</form>")

  }

  @Page(value = "list" , responseTemplate = "cars/list.ftl")
  void list(CloverXRequest request) {
    request.addAttribute("cars" , getCars(request))
  }

  @Page(value = "read" , responseTemplate = "cars/list.ftl")
  void read(Car car, CloverXRequest request) {
    LOGGER.info(car)
    List<Car> cars = getCars(request)
    cars << car
    request.addAttribute("cars" , cars)
  }

  List<Car> getCars(CloverXRequest request) {
    List<Car> cars = (List<Car>) request.getSession().getAttribute("carList")
    if(!cars) {
      cars = new ArrayList()
      request.getSession().setAttribute("carList" , cars)
    }
    return cars
  }

}
