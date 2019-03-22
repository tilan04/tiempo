package es.pareja1.aplicacion.tiempo.service;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoNames;

@Service
public class TotalResultsCountServiceImpl implements TotalResultsCountService {

	public Bbox getBbox(GeoNames result) {
		return result.getBbox();
	}

}
