package org.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice1 {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome: nomes){
            System.out.println(nome);
        }

        nomes.set(2,"Roberto");

        System.out.println(nomes.get(1));

        nomes.remove(4);

        nomes.remove("Joao");

        System.out.println("Quantidade de items na lista: "+ nomes.size());

        System.out.println("Juliano existe? "+ (nomes.contains("Juliano") ? "sim": "nao"));

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes.addAll(nomes2);

        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println("Lista vazia? "+ (nomes.isEmpty() ? "sim": "nao"));

    }
}
