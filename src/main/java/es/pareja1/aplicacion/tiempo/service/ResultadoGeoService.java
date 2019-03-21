package es.pareja1.aplicacion.tiempo.service;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;

@Service
public interface ResultadoGeoService {

	public ResultadoGeo getResultadoGeo(int result);
	
}
