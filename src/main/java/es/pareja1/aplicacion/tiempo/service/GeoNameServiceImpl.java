package es.pareja1.aplicacion.tiempo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.dao.GeoNameDao;
import es.pareja1.aplicacion.tiempo.entity.ResultadoGeo;

@Service
public class GeoNameServiceImpl implements GeoNameService{
	
	@Autowired
	GeoNameDao geoNameDao;
	public ResultadoGeo getListGeonames(String nameCiudad) {
		return geoNameDao.getURI(nameCiudad);
		
	}

	
}
