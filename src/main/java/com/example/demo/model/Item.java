package com.example.demo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.Data;

@Data
public class Item {
    @NotNull
    private String name;

    @NotNull
    @Positive
    private Double price;

    private String description;
}
