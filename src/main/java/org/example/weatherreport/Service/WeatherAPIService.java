package org.example.weatherreport.Service;

import org.aspectj.lang.annotation.After;
import org.example.weatherreport.Entities.WeatherData;
import org.example.weatherreport.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIService {

    @Autowired
    private WeatherRepository weatherRepository;

    @Value("${openweathermap.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherData getWeatherData(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey;
        WeatherData data = restTemplate.getForObject(url, WeatherData.class);
        weatherRepository.save(data);
        return data;
    }
}
