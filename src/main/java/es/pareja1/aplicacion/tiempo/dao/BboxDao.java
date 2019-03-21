package es.pareja1.aplicacion.tiempo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;

@Repository
public class BboxDao {

	private List<Bbox> listaCoordenadas;
	
	private String uriCoordenadas="http://api.geonames.org/weatherJSON?username=ilgeonamessample";
	
	public GeoName getURI(Bbox bbox) {
		UriComponentsBuilder builder = UriComponentsBuilder
		    .fromUriString(uriCoordenadas)
		    // Añadir la query
		    .queryParam("north", bbox.getNorth())
		.queryParam("south", bbox.getSouth())
		.queryParam("east", bbox.getEast())
		.queryParam("west", bbox.getWest());

		RestTemplate restTemplate = new RestTemplate();
		GeoName response = restTemplate.getForObject(builder.toUriString(), GeoName.class);
		return response;
		}
	
	
	
}
