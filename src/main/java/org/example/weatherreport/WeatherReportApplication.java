package org.example.weatherreport;

import org.example.weatherreport.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherReportApplication implements CommandLineRunner {

    @Bean
    RestTemplate RestTamplate(){
        return new RestTemplate();
    }

    @Autowired
    private WeatherRepository weatherRepository;
    public static void main(String[] args) {SpringApplication.run(WeatherReportApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("this is testing");
        System.out.println("------------------------------------------------");
        weatherRepository.getWeatherData().forEach(e-> System.out.println(e));
        System.out.println("------------------------------------------------");
        System.out.println(weatherRepository.getWeatherByCityName("Lahore"));
        System.out.println("------------------------------------------------");
        weatherRepository.getLahoreWeather().forEach(e-> System.out.println(e));
    }

}
