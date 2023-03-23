package Unidade4_ED.CollectionTree;

import java.util.*;

public class ExCollection {
    public static void main(String[] args) {
        Set<Integer> arvore = new TreeSet<>();
        arvore.add(Integer.valueOf(1));

        arvore.add(5);

        arvore.remove(0);

        arvore.contains(Integer.valueOf(5));

        for (int j = 0; j < 5; j++) {
            System.out.println(j);
        }
    }
}
