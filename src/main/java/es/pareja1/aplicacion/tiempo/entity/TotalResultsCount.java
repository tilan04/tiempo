package es.pareja1.aplicacion.tiempo.entity;


import java.util.List;


public class TotalResultsCount {
	
	private int totalResultsCount;
	private List<GeoNames> geonames;

	public TotalResultsCount () {}
	public TotalResultsCount(int totalResultsCount, List<GeoNames> geoNames) {
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
	public List<GeoNames> getGeonames() {
		return geonames;
	}
	public void setGeonames(List<GeoNames> geonames) {
		this.geonames = geonames;
	}

	

}
