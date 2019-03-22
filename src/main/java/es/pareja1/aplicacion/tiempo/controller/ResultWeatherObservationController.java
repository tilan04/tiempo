package es.pareja1.aplicacion.tiempo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import es.pareja1.aplicacion.tiempo.service.ResultWeatherObservationServiceImpl;

@Controller
public class ResultWeatherObservationController {

	@Resource 
	private ResultWeatherObservationServiceImpl resultWeatherObservationService;
	
	

	
//	@GetMapping("/resultado")
//	public ModelAndView getGeoNames() {
//		TotalResultsCount r = geoNamesService.getListGeonames(geoNamesController.nombreCiudad);
//		return new ModelAndView("pages/resultado");
//	}
//	 @GetMapping(value = "/{Madrid}")
//	  public String showWeatherResultsPage(@PathVariable(ITEM) String item,
//	                                   ModelMap modelMap) {
////	   double weatherObs = resultWeatherObservationService.getMediaHumedad(listHumedadObservation);
//	    modelMap.addAttribute(MODEL_ATTRIBUTE_ITEM, almacen);
//	    return VIEW_ITEM_FORM;
//	  }


}


