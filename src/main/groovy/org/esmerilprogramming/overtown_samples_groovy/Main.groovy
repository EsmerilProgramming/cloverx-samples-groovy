package org.esmerilprogramming.overtown_samples_groovy

import org.esmerilprogramming.overtown.server.Overtown
import org.esmerilprogramming.overtown.server.ConfigurationBuilder

class Main {

  static main(args) {

    new Overtown(new ConfigurationBuilder()
    .withPackageToScan('org.esmerilprogramming.overtown_samples_groovy')
    .withHost('localhost')
    .build())

    println 'Sample form : http://localhost:8080/car/form'
    println 'Sample JSON response : http://localhost:8080/car/json'
    println 'Image: http://localhost:8080/static/img/dummy.png'
    println 'Static css: http://localhost:8080/static/css/cloverx.css'
    println 'Static js: http://localhost:8080/static/js/cloverx.js'

  }

}
