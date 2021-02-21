package org.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercice3 {
    public static void main(String[] args){
        Set<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        createHashSet(hashSet);
        createLinkedHashSet(linkedHashSet);
        createTreeSet(treeSet);
        printSet(hashSet, linkedHashSet, treeSet);

        hashSet.remove(3);
        linkedHashSet.remove(3);
        treeSet.remove(3);

        hashSet.add(23);
        linkedHashSet.add(23);
        treeSet.add(23);

        System.out.println("HashSet size: " + hashSet.size() );
        System.out.println("LinkedHashSet size: " + linkedHashSet.size() );
        System.out.println("TreeSet size: " + treeSet.size() );

        System.out.println("HashSet is empty? " + (hashSet.isEmpty()? "yes":"no"));
        System.out.println("LinkedHashSet is empty? " + (linkedHashSet.isEmpty()? "yes":"no"));
        System.out.println("TreeSet is empty? " + (treeSet.isEmpty()? "yes":"no"));

        printSet(hashSet, linkedHashSet, treeSet);
    }

    public static void createHashSet(Set<Integer> hashSet){
        hashSet.add(3);
        hashSet.add(88);
        hashSet.add(20);
        hashSet.add(44);
        hashSet.add(3);
    }

    public static void createLinkedHashSet(LinkedHashSet<Integer> linkedHashSet){
        linkedHashSet.add(3);
        linkedHashSet.add(88);
        linkedHashSet.add(20);
        linkedHashSet.add(44);
        linkedHashSet.add(3);
    }

    public static void createTreeSet(TreeSet<Integer> treeSet){
        treeSet.add(3);
        treeSet.add(88);
        treeSet.add(20);
        treeSet.add(44);
        treeSet.add(3);
    }

    public static void printSet(Set<Integer> hashSet, LinkedHashSet<Integer> linkedHashSet, TreeSet<Integer> treeSet){

        System.out.println("------------------HashSet------------------");
        for (var item: hashSet){
            System.out.println(item);
        }

        System.out.println("-----------------LinkedSet-----------------");
        for (var item: linkedHashSet){
            System.out.println(item);
        }

        System.out.println("------------------TreeSet------------------");
        for (var item: treeSet){
            System.out.println(item);
        }
    }
}
