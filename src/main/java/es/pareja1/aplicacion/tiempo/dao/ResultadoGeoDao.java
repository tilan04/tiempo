package es.pareja1.aplicacion.tiempo.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import es.pareja1.aplicacion.tiempo.entity.GeoName;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;

@Repository
public class ResultadoGeoDao {
	
	private int resultado=0;
	private Set<ResultadoGeo> listaResultadoGeoNames = new HashSet<>();
	private GeoName geoNames;
	
	/*public ResultadoGeo getResultadoGeo(int result) {
		List<ResultadoGeo> listaResultado=new ArrayList<>(listaResultadoGeoNames);
		//return listaResultado.stream().filter(c->c.getResultado()==result).findFirst().orElse(null);
	}
*/
}
