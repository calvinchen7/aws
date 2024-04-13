package org.paumard.model;

public class City extends Object {

    private final String name;
    private int population;

    public City(String name) {
        this(name, 0);
    }

    public City(String name, int population) {
        super();
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
