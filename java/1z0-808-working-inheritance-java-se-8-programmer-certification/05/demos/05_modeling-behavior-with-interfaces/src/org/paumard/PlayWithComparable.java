package org.paumard;

import org.paumard.model.Capital;
import org.paumard.model.City;

public class PlayWithComparable {

    public static void main(String[] args) {

        Comparable<Capital> paris = new Capital();

        Capital london = new Capital();
        london.setName("London");

        Comparable<Capital> londonComparable = london;

        City newYork = new Capital();
        Comparable<Capital> comparable = (Comparable)newYork;

    }
}
