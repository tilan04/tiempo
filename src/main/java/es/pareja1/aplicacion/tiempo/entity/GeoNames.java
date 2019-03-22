package es.pareja1.aplicacion.tiempo.entity;

public class GeoNames {

	private String asciiName;// Nombre de la ciudad a buscar
	private Bbox bbox;

	public GeoNames() {
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


}
