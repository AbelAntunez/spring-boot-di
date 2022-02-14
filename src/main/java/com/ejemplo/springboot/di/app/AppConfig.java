package com.ejemplo.springboot.di.app;

import com.ejemplo.springboot.di.app.models.ItemFactura;
import com.ejemplo.springboot.di.app.models.Producto;
import com.ejemplo.springboot.di.app.services.IServicio;
import com.ejemplo.springboot.di.app.services.MiServicio;
import com.ejemplo.springboot.di.app.services.MiServicioComplejo;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

  @Bean("miServicioSimple")
  public IServicio registrarMiServicio() {
    return new MiServicio();
  }

  @Bean("miServicioComplejo")
  @Primary
  public IServicio registrarMiServicioComplejo() {
    return new MiServicioComplejo();
  }

  @Bean("itemsFactura")
  public List<ItemFactura> registrarItems() {
    Producto producto1 = new Producto("Camara Sony", 750);
    Producto producto2 = new Producto("Bicicleta aro 26", 200);

    ItemFactura linea1 = new ItemFactura(producto1, 2);
    ItemFactura linea2 = new ItemFactura(producto2, 4);

    return Arrays.asList(linea1, linea2);
  }

  @Bean("itemsFacturaOficina")
  @Primary
  public List<ItemFactura> registrarItemsOficina() {
    Producto producto1 = new Producto("Monitor LG", 250);
    Producto producto2 = new Producto("Notebook Asus", 500);
    Producto producto3 = new Producto("Impresora", 150);
    Producto producto4 = new Producto("Escritorio oficina", 400);

    ItemFactura linea1 = new ItemFactura(producto1, 1);
    ItemFactura linea2 = new ItemFactura(producto2, 1);
    ItemFactura linea3 = new ItemFactura(producto3, 1);
    ItemFactura linea4 = new ItemFactura(producto4, 1);

    return Arrays.asList(linea1, linea2, linea3, linea4);
  }

}
