package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    final private  String name;
    final private BigDecimal quantityOfPeople;


    public Country(String name, BigDecimal quantityOfPeople) {
        this.name = name;
        this.quantityOfPeople = quantityOfPeople;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getQuantityOfPeople() {
        return quantityOfPeople;
    }


}
