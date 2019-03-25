package es.pareja1.aplicacion.tiempo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
import es.pareja1.aplicacion.tiempo.service.ResultWeatherObservationService;
import es.pareja1.aplicacion.tiempo.service.ResultWeatherObservationServiceImpl;

@Controller
public class GeoNamesController {

	@Resource
	private GeoNamesService geoNamesService;

	@Autowired
	ResultWeatherObservationService weather;
	private List<String> listaBusquedas = new ArrayList<String>();

	@RequestMapping("/index") // Indicamos la URL con la que se ejecuta
	public ModelAndView getListGeoNames() {
		TotalResultsCount r = geoNamesService.getListGeonames("Madrid");
		Bbox b = r.getGeonames().get(0).getBbox();
		List<WeatherObservations> listaObservaciones = geoNamesService.getListWeatherObservation(b);
		// session.setAttribute("mySessionAttribute", "someValue");
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

	@RequestMapping(value = "/resultado", method = {RequestMethod.POST, RequestMethod.GET})
	public String greetingSubmit(String nombre, Model model) {

		model.addAttribute("ciudadBuscada", nombre);
		TotalResultsCount r = geoNamesService.getListGeonames(nombre);

		Bbox b = r.getGeonames().get(0).getBbox();
		List<WeatherObservations> listaObservaciones = geoNamesService.getListWeatherObservation(b);
		model.addAttribute("temperaturaMedia", weather.getMediaTemperaturas(listaObservaciones));
		model.addAttribute("humedadMedia", weather.getMediaHumedad(listaObservaciones));
		model.addAttribute("vientoMedio", weather.getMediaViento(listaObservaciones));
		model.addAttribute("listaObservaciones", listaObservaciones);
		model.addAttribute("geoName", r.getGeonames().get(0));

//    		model.addAttribute("stationName",weather.getStationName(listaObservaciones));
		if (listaObservaciones != null) {
			listaBusquedas.add(nombre);
		}
		return "pages/tiempo";
	}

	@RequestMapping(value = "")
	public String getHome(HttpSession session) {
		session.setAttribute("mySession", listaBusquedas);

		return "pages/index";
	}

}
