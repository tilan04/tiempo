package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public interface ResultWeatherObservationService {

	public double getMediaTemperaturas(List<WeatherObservations> listTemperatureObservation);
	public double getMediaHumedad(List<WeatherObservations> listHumedadObservation);
	public double getMediaViento(List<WeatherObservations> listVientoObservation);
}