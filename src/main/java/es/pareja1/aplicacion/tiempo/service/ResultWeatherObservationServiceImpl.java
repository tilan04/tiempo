package es.pareja1.aplicacion.tiempo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.pareja1.aplicacion.tiempo.entity.WeatherObservations;

@Service
public class ResultWeatherObservationServiceImpl implements ResultWeatherObservationService {

//	@Autowired
//	List<WeatherObservations> listObservatorio;

	@Override
	public double getMediaTemperaturas(List<WeatherObservations> listTemperatureObservation) {
		for (WeatherObservations weatherObservations : listTemperatureObservation) {
			double mediaTemperatura = +Double.parseDouble(weatherObservations.getTemperature());
			return mediaTemperatura / listTemperatureObservation.size();
		}
		return 0.1;
	}

	@Override
	public double getMediaHumedad(List<WeatherObservations> listHumedadObservation) {
		for (WeatherObservations weatherObservations : listHumedadObservation) {
			double mediaHumedad = +weatherObservations.getHumidity();
			return mediaHumedad / listHumedadObservation.size();
		}
		return 0.2;
	}

	@Override
	public double getMediaViento(List<WeatherObservations> listVientoObservation) {
		for (WeatherObservations weatherObservations : listVientoObservation) {
			double mediaViento=+ Double.parseDouble(weatherObservations.getWindSpeed());
			return mediaViento/listVientoObservation.size();
		}
		return 0.3;
	}

}