package com.company.lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListex {
    public static void main(String[] args) {
        List<String> apple = new ArrayList<>();

        apple.add("semerenko");
        apple.add("aidared");
        apple.add("macbook");

        apple.remove(2);

        apple.set(1, "antonovka");

        List<String> potato = new ArrayList<>();
        potato.add("картошка1");
        potato.add("картошка2");
        apple.addAll(potato);
        /*System.out.println(apple.size());
        System.out.println(apple);*/
//        1 method perebora items
        for (int i = 0; i < apple.size(); i++) {
            System.out.println(i+"="+apple.get(i) );

        }
//        2 method foreach
        for (String str:apple ) {
            System.out.println(apple.indexOf(str)+ "="+str );
        }
//         3 method iterator
        Iterator<String> iterator = apple.iterator();
        while (iterator.hasNext()){
            String str =iterator.next();
            System.out.println(apple.indexOf(str)+ "="+str );
        }

//        4 method listiterator
        ListIterator<String> listiterator = apple.listIterator(apple.size());
        while (listiterator.hasPrevious()){

            System.out.println(listiterator.previousIndex()+" " +listiterator.previous() );
        }
    }
}
