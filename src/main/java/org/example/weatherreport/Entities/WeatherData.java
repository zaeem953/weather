package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {

    @Id
    private int id;
    private int visibility;
    private long dt;
    private int timezone;
    private String base;
    private String name;
    private int cod;
    @OneToOne(cascade = CascadeType.ALL)
    private Wind wind;
    @OneToOne(cascade = CascadeType.ALL)
    private Clouds clouds;
    @OneToOne(cascade = CascadeType.ALL)
    private Sys sys;
    @OneToOne(cascade = CascadeType.ALL)
    private Coord coord;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Weather> weather=new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Main main;

    @Override
    public String toString() {
        return "WeatherData{" +
                "id=" + id +
                ", visibility=" + visibility +
                ", dt=" + dt +
                ", timezone=" + timezone +
                ", base='" + base + '\'' +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", sys=" + sys +
                ", coord=" + coord +
                ", weather=" + weather +
                ", main=" + main +
                '}';
    }
}

