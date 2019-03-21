package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public interface GeoNameService {

	public ResultadoGeo getListGeonames(String nameCiudad);
	
	public List<WeatherObservations> getListWeatherObservation (Bbox bbox);

}
