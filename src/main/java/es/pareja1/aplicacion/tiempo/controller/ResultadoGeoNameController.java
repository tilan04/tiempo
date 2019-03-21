package es.pareja1.aplicacion.tiempo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.pareja1.aplicacion.tiempo.service.GeoNameService;
import es.pareja1.aplicacion.tiempo.service.ResultadoGeoService;

@Controller
public class ResultadoGeoNameController {

	@Resource 
	private GeoNameService geoNameService;
	
	@RequestMapping("/formulario_busqueda") // Indicamos la URL con la que se ejecuta
	public ModelAndView getBbox() {
		//ResultadoGeoService r = //resultadoGeoService.getListGeonames("Madrid");

		return new ModelAndView("pages/formulario_busqueda").addObject("nombre", "Mundo");
//	-Nombre de la plantilla HTML-  //-Informacion para la página, para el Modelo-s
	}
	
//	@RequestMapping("/formulario_busqueda")
//	public String formularioPeticiones(Model modelo) {
//	 
//	modelo.addAttribute("mensaje","peticion GET");
//	return "pages/formulario_busqueda";
//	 
//	}
//	@RequestMapping("/resultado")
//	public String resultadoPeticiones(Model modelo) {
//	 
//	modelo.addAttribute("mensaje","peticion POST");
//	return "pages/resultado";
//	 
//	}
//	@RequestMapping(value = "resultadoPeticiones", method = RequestMethod.POST)
//    public String getParametro(String nombre) {
//    return nombre;
}


