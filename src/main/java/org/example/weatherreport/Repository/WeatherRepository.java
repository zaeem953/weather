package org.example.weatherreport.Repository;

import org.example.weatherreport.Entities.WeatherData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public interface WeatherRepository extends JpaRepository<WeatherData,Integer> {
    @Query("select w From WeatherData w where w.id>0")
    public List<WeatherData> getWeatherData();

    @Query("select w From WeatherData w where w.name=:n and w.cod=200")
    public List<WeatherData> getWeatherByCityName(@Param("n") String n);

    //Navite Query (SQL Query)
    @Query(value="select * From weather_data wd where wd.name='Lahore' and wd.cod=200",nativeQuery = true)
    public List<WeatherData> getLahoreWeather();
}
