package es.pareja1.aplicacion.tiempo.service;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;

@Service
public class ResultadoGeoServiceImpl implements ResultadoGeoService {


	public Bbox getBbox(GeoName result) {
		return result.getBbox();
	}
	
	
	
	

}
