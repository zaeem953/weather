package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wind {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private double speed;
    private int deg;


}


