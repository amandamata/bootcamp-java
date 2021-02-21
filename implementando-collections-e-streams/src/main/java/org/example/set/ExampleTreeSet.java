package org.example.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args){
        TreeSet<String> treeCapitals = new TreeSet<>();
        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("Sao Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println(treeCapitals);

        System.out.println("First: " + treeCapitals.first());
        System.out.println("Last: " + treeCapitals.last());
        System.out.println("First lower Florianopolis: " + treeCapitals.lower("Florianopolis"));
        System.out.println("First higher Florianopolis: " + treeCapitals.higher("Florianopolis"));
        System.out.println("First and remove: " + treeCapitals.pollFirst());
        System.out.println("Last and remove: " + treeCapitals.pollLast());

        Iterator<String> iterator = treeCapitals.iterator();
        System.out.println("----------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----------------------");
        for (var capital: treeCapitals) {
            System.out.println(capital);
        }
    }
}
