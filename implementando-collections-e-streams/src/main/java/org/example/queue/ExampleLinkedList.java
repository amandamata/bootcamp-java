package org.example.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExampleLinkedList {

    public static void main(String[] args){

        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Amanda");
        bankQueue.add("Carol");
        bankQueue.add("Flavio");
        bankQueue.add("Pamela");
        bankQueue.add("Anderson");
        System.out.println(bankQueue);

        var nextCustomer = bankQueue.poll();
        System.out.println(nextCustomer);
        System.out.println(bankQueue);

        nextCustomer = bankQueue.peek();
        System.out.println(nextCustomer);
        System.out.println(bankQueue);

        var nextCustomerOrError = bankQueue.element();
        System.out.println(nextCustomerOrError);
        System.out.println(bankQueue);

        for (String client: bankQueue) {
            System.out.println(client);
        }

        Iterator<String> iteratorBankQueue = bankQueue.iterator();

        while(iteratorBankQueue.hasNext()){
            System.out.println(iteratorBankQueue.next());
        }

        System.out.println(bankQueue.size());

        System.out.println(bankQueue.isEmpty());
    }
}
