package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.Bbox;
import es.pareja1.aplicacion.tiempo.entity.GeoName;



@Service
public class GeoNameService {
	
	@Autowired
	private String asciiName;
	private List<Bbox> bboxes;
	

}
