package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        // temporary stub so the project builds
        return false;
    }




    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
}
