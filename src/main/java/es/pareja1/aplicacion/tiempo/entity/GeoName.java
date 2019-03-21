package es.pareja1.aplicacion.tiempo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GeoName {

	private String asciiName;// Nombre de la ciudad a buscar
	private Bbox bbox;

	private final String pattern1 = "http://api.geonames.org/searchJSON?q=";
	private final String pattern2 = "&maxRows=20&startRow=0&lang=en&isNameRequired =true&style=FULL&username=ilgeonamessample";


	public GeoName () {}

	public GeoName(String asciiName, Bbox bbox) {
		super();
		this.asciiName = asciiName;
		this.bbox = bbox;
	}

	public String getPattern1() {
		return pattern1;
	}

	public String getPattern2() {
		return pattern2;
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

	@Override
	public String toString() {
		return pattern1 + asciiName + pattern2;
	}

}
