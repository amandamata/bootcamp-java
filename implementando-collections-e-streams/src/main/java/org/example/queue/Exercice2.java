package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Exercice2 {

    public static void main(String[] args){
        var queue = createQueue();
        printQueue(queue);

        System.out.println("Using peek " + queue.peek());
        printQueue(queue);

        System.out.println("Using poll: " + queue.poll());
        printQueue(queue);

        queue.add("Daniel");
        for (String name: queue) {
            if(name.contains("Daniel")){
                System.out.println("Daniel position: " + name.indexOf("Daniel"));
            }
        }

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue is empty? " + (queue.isEmpty()? "yes" : "no"));
        System.out.println("Carlos is in the queue? " + (queue.contains("Carlos")? "yes" : "no"));



    }

    public static Queue<String> createQueue(){
        Queue<String> queue = new LinkedList<>();

        queue.add("Juliana");
        queue.add("Pedro");
        queue.add("Carlos");
        queue.add("Larissa");
        queue.add("João");
        return queue;
    }

    public static void printQueue(Queue<String> queue){
        System.out.println("-----------Queue--------------");
        for (String name: queue) {
            System.out.println(name);
        }
        System.out.println("-----------------------------");
    }
}
