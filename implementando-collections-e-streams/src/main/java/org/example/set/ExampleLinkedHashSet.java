package org.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExampleLinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();

        numericalSequence.add(1);
        numericalSequence.add(2);
        numericalSequence.add(4);
        numericalSequence.add(8);
        numericalSequence.add(16);
        System.out.println(numericalSequence);

        numericalSequence.remove(4);
        System.out.println(numericalSequence);

        Iterator<Integer> iterator = numericalSequence.iterator();
        System.out.println("-----------------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------------");
        for (var number: numericalSequence) {
            System.out.println(number);
        }

        numericalSequence.clear();
        System.out.println("LinkedHashSet is empty? " + (numericalSequence.isEmpty()? "yes": "no"));
    }
}
