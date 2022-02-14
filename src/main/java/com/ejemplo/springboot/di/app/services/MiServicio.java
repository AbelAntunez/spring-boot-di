package com.ejemplo.springboot.di.app.services;

import org.springframework.stereotype.Service;

//@Service("miServicioSimple")
public class MiServicio implements IServicio {

  @Override
  public String operacion() {
    return "Ejecutando la operación...";
  }
}
