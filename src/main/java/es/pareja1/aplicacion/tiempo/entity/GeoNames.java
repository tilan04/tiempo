package es.pareja1.aplicacion.tiempo.entity;

public class GeoNames {

	private String asciiName;// Nombre de la ciudad a buscar
	private double lat;
	private double lng;
	private Bbox bbox;

	public GeoNames() {
	}

	public GeoNames(String asciiName, double lat, double lng, Bbox bbox) {
		super();
		this.asciiName = asciiName;
		this.lat = lat;
		this.lng = lng;
		this.bbox = bbox;
	}

	public GeoNames(String asciiName, Bbox bbox) {
		super();
		this.asciiName = asciiName;
		this.bbox = bbox;
	}

	public String getAsciiName() {
		return asciiName;
	}

	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}

	public Bbox getBbox() {
		return bbox;
	}

	public void setBbox(Bbox bbox) {
		this.bbox = bbox;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}


}
