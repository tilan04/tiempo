package es.pareja1.aplicacion.tiempo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GeoName {

	private String asciiName;// Nombre de la ciudad a buscar
	private Bbox bbox;

	public GeoName() {
	}

	public GeoName(String asciiName, Bbox bbox) {
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
