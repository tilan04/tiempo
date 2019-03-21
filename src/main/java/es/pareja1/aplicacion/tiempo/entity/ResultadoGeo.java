package es.pareja1.aplicacion.tiempo.entity;


import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResultadoGeo {
	private int totalResultsCount;
	private List<GeoName> geonames;

	public ResultadoGeo () {}
	public ResultadoGeo(int totalResultsCount, List<GeoName> geoNames) {
		super();
		this.totalResultsCount = totalResultsCount;
		this.geonames = geoNames;
	}
	public int getTotalResultsCount() {
		return totalResultsCount;
	}
	public void setTotalResultsCount(int totalResultsCount) {
		this.totalResultsCount = totalResultsCount;
	}
	public List<GeoName> getGeonames() {
		return geonames;
	}
	public void setGeonames(List<GeoName> geonames) {
		this.geonames = geonames;
	}

	

}
