package org.paumard.model;

public class Capital extends City {

    @Override
    public String toString() {
        return "Capital{" +
                "name='" + getName() + '\'' +
                ", population=" + getPopulation() +
                '}';
    }
}
