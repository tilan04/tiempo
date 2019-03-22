package es.pareja1.aplicacion.tiempo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.TotalResultsCount;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;
import es.pareja1.aplicacion.tiempo.service.GeoNamesService;

@Controller
public class GeoNamesController {

	@Resource
	private GeoNamesService geoNamesService;

	
	@RequestMapping("/index") // Indicamos la URL con la que se ejecuta
	public ModelAndView getListGeoNames() {
		TotalResultsCount r = geoNamesService.getListGeonames("Madrid");
		Bbox b = r.getGeonames().get(0).getBbox();
		List<WeatherObservations> listaObservaciones = geoNamesService.getListWeatherObservation(b);
		
		return new ModelAndView("pages/index");
//	-Nombre de la plantilla HTML-  //-Informacion para la página, para el Modelo-
	}
	
    @GetMapping("/index")
    public String getResultForm(Model model) {
        model.addAttribute("geonames", new TotalResultsCount());
        return "ciudades";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute TotalResultsCount totalResultsCiudades) {
        return "ciudadesResult";
    }

//	@RequestMapping(value = "/formulario", method = RequestMethod.GET) // Indicamos la URL con la que se ejecuta
//	public ModelAndView getBbox() {
//		TotalResultsCount r = geoNamesService.getListGeonames("Madrid");
//
//		return new ModelAndView("pages/resultado").addObject("nombre", "Mundo");
////	-Nombre de la plantilla HTML-  //-Informacion para la página, para el Modelo-s
//	}
	
//	@RequestMapping(value = "/resultado", method = RequestMethod.POST)
//	public String getAsciiName(String asciiName) {
//		TotalResultsCount r = geoNamesService.getListGeonames(asciiName);
//		return asciiName;
//	}
	
    	@RequestMapping(value = "/resultado", method = RequestMethod.POST)
	    public String greetingSubmit( String nombre, Model model) {
    		
    		
    		model.addAttribute("ciudadBuscada", nombre);
    		
    		
    		
	        return "pages/tiempo";
	    }
		
}
