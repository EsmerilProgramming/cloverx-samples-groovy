package br.esmerilprogramming;

import org.esmerilprogramming.cloverx.server.CloverX;
import org.esmerilprogramming.cloverx.server.ConfigurationBuilder;

public class AppMain {

  public static void main(String[] args) {

    new CloverX(new ConfigurationBuilder()
            .withPackageToScan("br.esmerilprogramming")
            .withHost("localhost")
    .build());

    System.out.println("Sample form : http://localhost:8080/car/form");
    System.out.println("Sample JSON response : http://localhost:8080/car/json");
    System.out.println("Image: http://localhost:8080/static/img/dummy.png");
    System.out.println("Static css: http://localhost:8080/static/css/cloverx.css");
    System.out.println("Static js: http://localhost:8080/static/js/cloverx.js");

  }

}
