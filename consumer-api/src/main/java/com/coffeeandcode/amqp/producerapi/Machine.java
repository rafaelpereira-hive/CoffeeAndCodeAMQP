package com.coffeeandcode.amqp.producerapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Machine implements Serializable {
    private String brand;
    private String model;
    private String fabricationYear;
}
