package br.esmerilprogramming.controller;

import br.esmerilprogramming.model.Car;
import br.esmerilprogramming.model.Contact;
import org.esmerilprogramming.cloverx.annotation.Controller;
import org.esmerilprogramming.cloverx.annotation.JSONResponse;
import org.esmerilprogramming.cloverx.annotation.Page;
import org.esmerilprogramming.cloverx.http.CloverXRequest;
import org.esmerilprogramming.cloverx.http.JsonResponse;

/**
 * Created by efraimgentil on 19/01/15.
 */
@Controller
public class JsonController {

  @Page(value = "json/form",responseTemplate = "json.ftl")
  public void form(){

  }

  @JSONResponse(rootAttribute = "")
  @Page(value="json/toJson")
  public void toJson(Contact contact , CloverXRequest request){
    System.out.println(contact);
    request.addAttribute("contact" , contact );
  }

  @Page("json/car")
  public void json(JsonResponse response){
    Car car = new Car(2004 , "Honda Fit");
    response.addAttribute("car" , car );
  }

}
