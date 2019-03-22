package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.dao.GeoNamesDao;
import es.pareja1.aplicacion.tiempo.dao.TotalResultsCountDao;
import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.TotalResultsCount;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public class GeoNamesServiceImpl implements GeoNamesService {

	@Autowired
	GeoNamesDao geoNamesDao;

	@Autowired
	TotalResultsCountDao totalResultsCountDao;

	public TotalResultsCount getListGeonames(String nameCiudad) {
		return geoNamesDao.getURI(nameCiudad);

	}

	public Bbox getBbox(TotalResultsCount resultado) {

		return resultado.getGeonames().get(0).getBbox();
	}

	public List<WeatherObservations> getListWeatherObservation(Bbox bbox) {
		return totalResultsCountDao.getListWeatherObservation(bbox);

	}

}
