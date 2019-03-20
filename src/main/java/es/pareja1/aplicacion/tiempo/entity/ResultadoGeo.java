package es.pareja1.aplicacion.tiempo.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class ResultadoGeo {
	private int resultado;
	private List<GeoName> geoNames;

	public ResultadoGeo(int resultado, List<GeoName> geoNames) {
		super();
		this.resultado = resultado;
		this.geoNames = geoNames;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public List<GeoName> getGeoNames() {
		return geoNames;
	}

	public void setGeoNames(List<GeoName> geoNames) {
		this.geoNames = geoNames;
	}

}
