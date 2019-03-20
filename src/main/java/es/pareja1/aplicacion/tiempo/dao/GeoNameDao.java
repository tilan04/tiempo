package es.pareja1.aplicacion.tiempo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;

@Repository
public class GeoNameDao {
	
	private String asciiName;
	private List<Bbox> bboxes;
	
//	public String getGeoName(String resultado) {
//		
//		GeoName busqueda = asciiName.stream().filter(geo->geo.getResultado()==resultado).findFirst().orElse(null);
//		return busqueda.getResultado();
//		
//	
//	}

}
