package org.example.weatherreport.Controller;

import org.example.weatherreport.Entities.WeatherData;
import org.example.weatherreport.Service.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Controller
@Controller
public class WeatherController {

    @Autowired
    private WeatherAPIService weatherAPIService;

    //@Scheduled(cron = "0/1 0/1 16 14 2 3")
    @GetMapping(value = "/weather/{city}",produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWeatherData(@PathVariable String city, Model model) {
        WeatherData weatherData = weatherAPIService.getWeatherData(city);
        model.addAttribute("weatherData", weatherData);
        return "weather_report";
    }


}
