package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Main {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int pressure;
    private int humidity;


}
