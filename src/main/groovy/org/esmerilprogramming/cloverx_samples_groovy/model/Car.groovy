package org.esmerilprogramming.cloverx_samples_groovy.model

import groovy.transform.Canonical

@Canonical
class Car {

  int year
  String model

  Car(int year, String model) {
    this.year = year
    this.model = model
  }

  Car() {

  }

}
