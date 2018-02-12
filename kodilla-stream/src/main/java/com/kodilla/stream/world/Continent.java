package com.kodilla.stream.world;

import java.util.*;

final public class Continent {
    private final String name;
    private final Set<Country> countryOnContinent;

    public Continent(String name, Set<Country> temp) {
        this.name = name;
        this.countryOnContinent = temp;
    }



    public String getName() {
        return name;
    }

    public Collection<Country> getCountryOnContinent() {
        return countryOnContinent;
    }


}
