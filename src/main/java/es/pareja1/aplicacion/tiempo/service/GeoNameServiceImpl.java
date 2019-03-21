package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.dao.GeoNameDao;
import es.pareja1.aplicacion.tiempo.dao.ResultadoGeoDao;
import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public class GeoNameServiceImpl implements GeoNameService{
	
	@Autowired
	GeoNameDao geoNameDao;
	
	@Autowired
	ResultadoGeoDao resultadoGeoDao;
	
	
	public ResultadoGeo getListGeonames(String nameCiudad) {
		return geoNameDao.getURI(nameCiudad);
		
	}

	public Bbox getBbox (ResultadoGeo resultado) {
		
		return resultado.getGeonames().get(0).getBbox();
	}
	
	public List<WeatherObservations> getListWeatherObservation (Bbox bbox) {
		return resultadoGeoDao.getListWeatherObservation(bbox);
	
	}

}
