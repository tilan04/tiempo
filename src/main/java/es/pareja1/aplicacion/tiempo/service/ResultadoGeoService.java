package es.pareja1.aplicacion.tiempo.service;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;

@Service
public interface ResultadoGeoService {

	public Bbox getBbox(GeoName result);

}
