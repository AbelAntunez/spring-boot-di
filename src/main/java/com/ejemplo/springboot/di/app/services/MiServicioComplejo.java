package com.ejemplo.springboot.di.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Service("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio {

  @Override
  public String operacion() {
    return "Ejecutando muchas operaciones complejas...";
  }
}
