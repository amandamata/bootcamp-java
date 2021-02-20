package org.example.list;

import java.util.List;
import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args){
        List<String> sports = new Vector<>();

        sports.add("Futebol");
        sports.add("Basquetebol");
        sports.add("Tenis");
        sports.add("Handbol");

        sports.set(2, "Ping Pong");
        sports.remove(2);
        sports.remove("Handbol");

        System.out.println(sports.get(0));

        for (String sport: sports){
            System.out.println(sport);
        }
    }
}
