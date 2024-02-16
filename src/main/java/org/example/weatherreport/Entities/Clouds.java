package org.example.weatherreport.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Clouds {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "`all`")
    private int all;
}
