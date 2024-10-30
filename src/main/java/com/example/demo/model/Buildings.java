package com.example.demo.model;


import lombok.*;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Buildings {
    private UUID id;
    private String name;
    private String street;
    private Integer numberHouse;
    private Integer floor;
    private Integer entrances;
    private String builder;
    private LocalDate constructionDate;
}
