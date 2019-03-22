package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.TotalResultsCount;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public interface GeoNamesService {

	public TotalResultsCount getListGeonames(String nameCiudad);
	
	public List<WeatherObservations> getListWeatherObservation (Bbox bbox);

}
