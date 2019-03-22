package es.pareja1.aplicacion.tiempo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoNames;
import es.pareja1.aplicacion.tiempo.entity.ResultadoWeatherObservations;
import es.pareja1.aplicacion.tiempo.entity.TotalResultsCount;
import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Repository
public class TotalResultsCountDao {

	private String uriCoordenadas = "http://api.geonames.org/weatherJSON?username=ilgeonamessample";

	public GeoNames getResultadoGeo(TotalResultsCount result) {
		return result.getGeonames().get(0);
	}

	public Bbox getBbox(GeoNames result) {
		return result.getBbox();
	}

	public List<WeatherObservations> getListWeatherObservation(Bbox bbox) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uriCoordenadas)
				// Añadir la query
				.queryParam("north", bbox.getNorth()).queryParam("south", bbox.getSouth())
				.queryParam("east", bbox.getEast()).queryParam("west", bbox.getWest());

		RestTemplate restTemplate = new RestTemplate();
		ResultadoWeatherObservations response = restTemplate.getForObject(builder.toUriString(),
				ResultadoWeatherObservations.class);

		return response.getWeatherObservations();
	}

}
