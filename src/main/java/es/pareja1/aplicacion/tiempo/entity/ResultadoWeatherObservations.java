package es.pareja1.aplicacion.tiempo.entity;


import java.util.List;


public class ResultadoWeatherObservations {
	
	private List<WeatherObservations> weatherObservations;

	public ResultadoWeatherObservations () {}
	public ResultadoWeatherObservations(List<WeatherObservations> weatherObservations) {
		super();
		this.weatherObservations = weatherObservations;
	}
	public List<WeatherObservations> getWeatherObservations() {
		return weatherObservations;
	}
	public void setWeatherObservations(List<WeatherObservations> weatherObservations) {
		this.weatherObservations = weatherObservations;
	}

	

}
