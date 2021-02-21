package org.example.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args){
        Set<Double> studentGrade = new HashSet<>();
        studentGrade.add(5.8);
        studentGrade.add(9.3);
        studentGrade.add(6.5);
        studentGrade.add(10.0);
        studentGrade.add(5.4);
        studentGrade.add(7.3);
        studentGrade.add(3.8);
        studentGrade.add(4.0);

        System.out.println(studentGrade);

        studentGrade.remove(3.8);
        System.out.println(studentGrade);

        var size = studentGrade.size();
        System.out.println("Set size: " + studentGrade.size());

        Iterator<Double> iterator = studentGrade.iterator();
        System.out.println("-----------------------------------");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------------");
        for (var grade: studentGrade) {
            System.out.println(grade);
        }

        studentGrade.clear();
        System.out.println("Set is empty? " + (studentGrade.isEmpty()? "yes": "no"));
    }
}
