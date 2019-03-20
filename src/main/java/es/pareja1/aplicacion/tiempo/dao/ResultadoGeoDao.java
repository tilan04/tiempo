package es.pareja1.aplicacion.tiempo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.pareja1.aplicacion.tiempo.entity.GeoName;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;

@Repository

public class ResultadoGeoDao {
	private int resultado;
	private List<GeoName> geoNames;
	
//	public int getGeoName(int resultado) {
//
////	ResultadoGeo busqueda = geoNames.stream().filter(geo->geo.getResultado()==resultado).findFirst().orElse(null);
////	return busqueda.getResultado();
//	
//}

}
