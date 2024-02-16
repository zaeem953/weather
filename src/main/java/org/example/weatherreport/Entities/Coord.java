package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Coord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private double lon;
    private double lat;


}