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

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;
import es.pareja1.aplicacion.tiempo.service.GeoNameService;

@Controller
public class GeoNameController {

	@Resource 
	private GeoNameService geoNameService;
	
	
	@RequestMapping("/index") // Indicamos la URL con la que se ejecuta
	public ModelAndView getSaludo() {
		ResultadoGeo r = geoNameService.getListGeonames("Madrid");
		Bbox b = r.getGeonames().get(0).getBbox();
		 List<WeatherObservations> listaObservaciones = geoNameService.getListWeatherObservation (b);

		return new ModelAndView("pages/index").addObject("nombre", "Mundo");
//	-Nombre de la plantilla HTML-  //-Informacion para la página, para el Modelo-
	}
	
	@GetMapping("/pages/resultado")
	public String getGeoNames(GeoName geo) {
		
		//ResultadoGeo r = geoNameService.getListGeonames(this.getAsciiName(geo));
	    return "pages/resultado";
	}
	
	@RequestMapping(value="/resultadoPeticiones",method=RequestMethod.POST) // Indicamos la URL con la que se ejecuta
	public String getAsciiName(@ModelAttribute String asciiName) {
		//String nombreCiudad=geoName.getAsciiName();
		return asciiName;
	}
	
//	@RequestMapping("/pages/resultado")
//	public String listGeoNames(@RequestParam String nameCiudad) { 
//		ResultadoGeo r = geoNameService.getListGeonames("Madrid");
//	    return "/pages/resultado";
//	}

}
