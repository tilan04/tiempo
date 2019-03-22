package es.pareja1.aplicacion.tiempo.entity;

public class WeatherObservations {
	
	private double lng;
	private double lat;
	private String stationName;
	private String weatherCondition;
	private int windDirection;
	private String windSpeed;
	private String temperature;
	private int humidity;
	
	

	public WeatherObservations() {
	}

	public WeatherObservations(double lng, double lat, String stationName, String weatherCondition, int windDirection,
			String windSpeed, String temperature, int humidity) {
		super();
		this.lng = lng;
		this.lat = lat;
		this.stationName = stationName;
		this.weatherCondition = weatherCondition;
		this.windDirection = windDirection;
		this.windSpeed = windSpeed;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}

	public int getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(int windDirection) {
		this.windDirection = windDirection;
	}

	public String getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(String windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
