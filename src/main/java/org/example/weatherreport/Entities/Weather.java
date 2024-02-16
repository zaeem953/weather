package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Weather {

    @Id
    private int id;
    private String main;
    private String description;
    private String icon;
}
