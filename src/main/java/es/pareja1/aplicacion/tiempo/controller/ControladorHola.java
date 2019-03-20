package es.pareja1.aplicacion.tiempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorHola {

  public static final String VIEW_INDEX = "pages/index";

  @RequestMapping(value = "/")
  public String getHome() {
    return VIEW_INDEX;
  }
}