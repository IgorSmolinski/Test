package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

public final class World {
    private final Collection<Continent> listOfContinents;

    public Collection<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public World(Collection<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getCountryOnContinent().stream())
                .map(Country::getQuantityOfPeople)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}