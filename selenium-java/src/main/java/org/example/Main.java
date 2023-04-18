package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Se introduc 6 numere int de la tastatura si se salveaza intr-un array.
 *
 *     a) se va crea o metoda responsabila de returnarea intr-un nou array a numerelor pare e.g. getEvenNumbers(int [] givenArray)
 *     b) se va crea o metoda responsabila de returnarea intr-un nou array a numerelor impare e.g. getOddNumbers(int [] givenArray)
 *     c) se va crea o moteoda reposanbila de calcularea mediei numerelor pare e.g. getAverageOfEvenNumbers(int [] givenArray)
 *     d) se va crea o moteoda reposanbila de calcularea mediei numerelor impare e.g. getAverageOfOddNumbers(int [] givenArray)
 *     e) se va crea o motoda responsabila de returnarea intr-un nou array a numerelor pare de pe pozitiile pare e.g. getEvenNumbersFromEvenIndex(int [] givenArray)
 *     f) se va crea o motoda responsabila de returnarea intr-un nou array a numerelor pare de pe pozitiile impare e.g. getOddNumbersFromOddIndex(int [] givenArray)
 *     g) se va crea o motoda responsabila de returnarea unui boolean daca suma numerelor pare din array este mai mare decat suma numerelor impare e.g. checkSumOfEvenOdd(int [] given array)
 *     h) se va crea o motoda responsabila de returnarea unui boolean daca suma numerelor de pe pozitiile pare din array este mai mare decat suma numerelor de pe pozitiile impare e.g. checkSumOfEvenOddIndexes(int [] given array)
 *     i) se va crea un switch case ce oferi utilizatorului optiunea de a alege ce metoda sa execute(metodele de la a-h) asupra array-ului dat.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> mylist = new ArrayList<>();
        mylist.add(5);
        mylist.add(7);
        mylist.add(8);
        mylist.add(4);
        mylist.add(9);
        List<Integer> evenList = getEvenNumbers(mylist);
        List<Integer> oddList = getOddNumbers(mylist);
        double averageE = getAverageOfEvenNumbers(mylist);
        System.out.println(evenList);
        System.out.println(oddList);
        System.out.println(averageE);
    }

    public static List<Integer> getEvenNumbers(List<Integer> givenArray) {
        List<Integer> evenList = new ArrayList<>();
        for(Integer i: givenArray) {
            if (i %2 == 0) {
                evenList.add(i);
            }
        }
        return evenList;
    }
    public static List<Integer> getOddNumbers(List<Integer> givenArray) {
        List<Integer> oddList = new ArrayList<>();
        for (Integer i : givenArray) {
            if (i % 2 == 1) {
                oddList.add(i);
            }
        }
        return oddList;
    }
    public static double getAverageOfEvenNumbers(List <Integer> givenArray) {
        List <Integer> evenList = getEvenNumbers(givenArray);
        double sum = 0;
        for (Integer i: evenList) {
            sum = sum +1;
        }
        return sum /evenList.size();
    }
}