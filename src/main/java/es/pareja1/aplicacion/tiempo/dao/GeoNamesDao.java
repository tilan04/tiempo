package es.pareja1.aplicacion.tiempo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import es.pareja1.aplicacion.tiempo.entity.GeoNames;
import es.pareja1.aplicacion.tiempo.entity.TotalResultsCount;

@Repository
public class GeoNamesDao {

	private GeoNames geoNames;
	
	private String uri="http://api.geonames.org/searchJSON?maxRows=20&startRow=0&lang=en&isNameRequired=true&style=FULL&username=ilgeonamessample";
	
	
	public TotalResultsCount getURI(String nameCiudad) {
	UriComponentsBuilder builder = UriComponentsBuilder
	    .fromUriString(uri)
	    // Añadir la query
	    .queryParam("q", nameCiudad);

	RestTemplate restTemplate = new RestTemplate();
	TotalResultsCount response = restTemplate.getForObject(builder.toUriString(), TotalResultsCount.class);
	return response;
	}
}
