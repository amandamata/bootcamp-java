package org.example.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {
    public static void main(String[] args){
        List<String> nomes = new ArrayList<>();

        nomes.add("Carol");
        nomes.add("Amanda");
        nomes.add("Maria");
        nomes.add("Joao");
        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(0,"Amanda Mata");
        System.out.println(nomes);

        nomes.remove(3);
        System.out.println(nomes);

        nomes.remove("Joao");
        System.out.println(nomes);

        var nome = nomes.get(1);
        System.out.println(nome);

        var tamanho = nomes.size();
        System.out.println(tamanho);

        var posicao = nomes.indexOf("Carol");
        System.out.println("Posicao: " + posicao);

        var hasAmanda = nomes.contains("Amanda Mata");
        System.out.println("Tem Amanda Mata? " + ((hasAmanda)? "sim" : "não"));

        //nomes.clear();
        var listaVazia = nomes.isEmpty();
        System.out.println("Lista vazia? " + ((listaVazia)? "sim" : "não"));

        for (String item: nomes) {
            System.out.println("-->" + item);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("--->" + iterator.next());
        }
    }
}
