package es.pareja1.aplicacion.tiempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GeoNameController2 {

	@RequestMapping("/formulario_busqueda")
	public String formularioPeticiones(Model modelo) {
	 
	modelo.addAttribute("mensaje","peticion GET");
	return "pages/formulario_busqueda";
	 
	}
	@RequestMapping("/resultado")
	public String resultadoPeticiones(Model modelo) {
	 
	modelo.addAttribute("mensaje","peticion POST");
	return "pages/resultado";
	 
	}
	@RequestMapping(value = "resultadoPeticiones", method = RequestMethod.POST)
    public String getParametro(String nombre) {
    return nombre;
}

}
