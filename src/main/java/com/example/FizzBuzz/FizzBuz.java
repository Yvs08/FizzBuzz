package com.example.FizzBuzz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuz {

    public static void main(String... agr) {

        FizzBuz fizzBuz = new FizzBuz();
      //  System.out.println(fizzBuz.checkAlgoFizzBuzz(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934)));
     //   System.out.println(fizzBuz.checkFizzOrBuzze(List.of(1, 3, 3, 51,15,155, 5, 6, 2, 4, 8934)));
        //System.out.println(fizzBuz.checkFizzOrBuzze(List.of(1, 3,55, 5,3000, 8934)));

        //System.out.println(fizzBuz.checkAlgoFizzBuzzArgJava8Bis(3));
        //System.out.println(fizzBuz.checkAlgoFizzBuzzBis(300));
        int[]  input = new int[]{1, 1,1, 3, 7, 7, 8, 9, 9, 9, 10,10,1};
        int current = input[0];
        boolean found = false;
        TreeSet<Integer> tab = new TreeSet<Integer>();
        System.out.println("test"+current);



        for (int i = 0; i < input.length; i++) {


           tab.add(input[i]);
        }
        System.out.print(" " + tab);




    }

    /* Params List<Integer>
     * Return List<String>
     * feature java<8  qui applique algo sur une liste entier
     * */
    public static List<String> checkAlgoFizzBuzz(List<Integer> num) {

        List<String> stringArrayList = new ArrayList<String>();
        for (Integer i : num) {
            {
                stringArrayList.add(checkFizzOrBuzz(i));
            }
        }
        return stringArrayList;
    }

    /*params int
     *return List<String>
     * feature java<8 qui applique algo sur une liste entier généré
     * */
    public static List<String> checkAlgoFizzBuzzBis(int num) {

        List<String> supplierNames1 = new ArrayList<String>();
        for (int i = 1; i <= num; i++) {
            supplierNames1.add(checkFizzOrBuzz(i));
        }
        return supplierNames1;
    }
    /*params int
    *return List<String>
    * feature en java8 qui traite une liste entier généré
    * */
    public static List<String> checkAlgoFizzBuzzArgJava8Bis(int num) {

        return IntStream.rangeClosed(1, num)
                .mapToObj(i -> checkFizzOrBuzz(i))
                .collect(Collectors.toList());
    }


    /* Params List<Integer>
     * Return List<String>
     * Feature en Java8 qui applique algo sur une liste entier
     * */
    public static Map<Boolean, Map<Boolean, List<Integer>>> checkAlgoFizzBuzzArgJava8(List<Integer> num) {

        return num.stream()
                .collect(Collectors.groupingBy(o -> String.valueOf(o).contains("3"),
                Collectors.groupingBy(o -> String.valueOf(o).contains("5"))));
    }

    /* Params :un enter
     * Feature qui traite algorithm fizzBuzz
     * Return un string
     * */
    public static List<String> checkFizzOrBuzze(List<Integer> num) {

        List<String> stringArrayList = new ArrayList<String>();
        Map<Boolean, Map<Boolean, List<Integer>>> i = num.stream()
                .collect(Collectors.groupingBy(o -> String.valueOf(o).contains("3"),
                        Collectors.groupingBy(o -> String.valueOf(o).contains("5"))));

        for (Map.Entry<Boolean, Map<Boolean, List<Integer>>> entry : i.entrySet()) {
            Map<Boolean, List<Integer>> map = entry.getValue();


            if (entry.getKey().equals(false)) {
                System.out.println("value" + entry.getKey());
                System.out.println("value" + entry.getValue());


                for (Map.Entry<Boolean, List<Integer>> entries : map.entrySet()) {
                    System.out.println("value" + entries.getKey());
                    System.out.println("value" + entries.getValue());
                    if (entries.getKey().equals(false)) {
                        for (Integer value : entries.getValue()) {
                            stringArrayList.add(checkFizzOrBuzz(value));
                        }
                    } else {
                        for (Integer value : entries.getValue()) {
                            stringArrayList.add(checkBuzz(value));
                        }
                    }

                }
            } else {
                for (Map.Entry<Boolean, List<Integer>> entries : map.entrySet()) {
                        // System.out.println("value"+ entry);
                        for (Integer value : entries.getValue()) {
                            stringArrayList.add(checkBuzz(value));
                        }
                }

            }
        }
        return stringArrayList;
    }

    public static String checkFizzOrBuzz(Integer i) {
        return i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : String.valueOf(i));
    }

    public static String checkBuzz(Integer i) {
        return "Buzz" ;
    }

    public static String checkFizz(Integer i) {
        return "Fizz" ;
    }
    //{false={false=[1, 100, 1000], true=[5, 5]}, true={false=[3, 3, 3000, 8934]}}


}
