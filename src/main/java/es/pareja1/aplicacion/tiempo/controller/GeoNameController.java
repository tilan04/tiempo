package es.pareja1.aplicacion.tiempo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.pareja1.aplicacion.tiempo.entity.GeoName;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;
import es.pareja1.aplicacion.tiempo.service.GeoNameService;

@Controller
public class GeoNameController {

	@Resource 
	private GeoNameService geoNameService;
	
	@RequestMapping("/index") // Indicamos la URL con la que se ejecuta
	public ModelAndView getSaludo() {
		ResultadoGeo r = geoNameService.getListGeonames("Madrid");

		return new ModelAndView("pages/index2").addObject("nombre", "Mundo");
//	-Nombre de la plantilla HTML-  //-Informacion para la página, para el Modelo-
	}
	
	@GetMapping("/pages/formulario_busqueda")
	public String getGeoNames(Model model,
	    @ModelAttribute("geonames") GeoName geonames,
	    BindingResult result) {
	    List<GeoName> ciudades = null;//Modificar
	    model.addAttribute("products", ciudades);
	    return "pages/resultado";
	}
	
	@RequestMapping(value="/pages/resultado", method=RequestMethod.GET)
	public String listGeoNames(@RequestParam String nameCiudad) { 
		ResultadoGeo r = geoNameService.getListGeonames("Madrid");
	    return "/pages/resultado";
	}

}
