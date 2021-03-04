import java.util.List;

public class FizzBuz {

    public static void main(String... agr) throws Exception {

        FizzBuz fizzBuz = new FizzBuz();
        fizzBuz.checkAlgoFizzBuzz(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934));
        fizzBuz.checkAlgoFizzBuzzArgJava8(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934));

    }

    /* Execution de l'algo avec pour argument une list entier et le modulo */
    private void checkAlgoFizzBuzz(List<Integer> num) {

        for (Integer i : num) {
            {
                if (((i % 3) == 0) && ((i % 5) == 0)) // multiple de 3 et 5
                    System.out.println("fizzbuzz");
                else if ((i % 3) == 0) // multiple de 3?
                    System.out.println("fizz");
                else if ((i % 5) == 0) //  multiple de 5?
                    System.out.println("buzz");
                else
                    System.out.println(i); //  cas écheant
            }
        }

    }

    /* Utilisation d'une operation ternaire  avec pour fonctionnalité java8 pour executer l'alogorithme*/
    private void checkAlgoFizzBuzzArgJava8(List<Integer> num) {
        num.stream()
                .map(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }


}
