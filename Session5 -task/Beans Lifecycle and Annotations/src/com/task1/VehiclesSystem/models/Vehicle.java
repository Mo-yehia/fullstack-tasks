package com.task1.VehiclesSystem.models;

import lombok.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    private int id;
    private String type;
    private String brand;
    private String color;

}
