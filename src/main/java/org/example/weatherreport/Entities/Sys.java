package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Sys {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sysId;
    private int id;
    private int type;
    private String country;
    private long sunrise;
    private long sunset;


}
