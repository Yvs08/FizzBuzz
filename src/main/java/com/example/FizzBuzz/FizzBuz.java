package com.example.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuz {

    public static void main(String... agr) {

        FizzBuz fizzBuz = new FizzBuz();
        System.out.println(fizzBuz.checkAlgoFizzBuzz(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934)));
        System.out.println(fizzBuz.checkAlgoFizzBuzzArgJava8(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934)));
        System.out.println(fizzBuz.checkAlgoFizzBuzzArgJava8Bis(3));
        System.out.println(fizzBuz.checkAlgoFizzBuzzBis(300));


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
    public static List<String> checkAlgoFizzBuzzArgJava8(List<Integer> num) {

        return num.stream()
                .map(i -> checkFizzOrBuzz(i))
                .collect(Collectors.toList());
    }

    /* Params :un enter
     * Feature qui traite algorithm fizzBuzz
     * Return un string
     * */
    private static String checkFizzOrBuzz(Integer i) {
        return i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : String.valueOf(i));
    }


}
