import com.example.FizzBuzz.FizzBuz;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {


    @Test
    public void fizzBuzzTest() {
        List<String> actual = List.of("1", "Fizz", "4", "Fizz", "Fizz", "Buzz", "Buzz", "FizzBuzz", "Fizz");
        List<String> expected = FizzBuz.checkAlgoFizzBuzz(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934));
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzTestJava8(){
        List <String>  actual = List.of("1","Fizz","4", "Fizz", "Fizz","Buzz","Buzz","FizzBuzz","Fizz");
        //List<String> expected = FizzBuz.checkAlgoFizzBuzzArgJava8(List.of(1, 3, 4, 6, 9, 100, 1000, 3000, 8934));
        //assertEquals(expected, actual);

    }

    @Test
    public void checkAlgoFizzBuzzArgJava8Bis(){
        List <String>  actual = List.of("1","2","Fizz","4");
        List<String> expected = FizzBuz.checkAlgoFizzBuzzBis(4);
        assertEquals(expected, actual);

    }

    @Test
    public void checkAlgoFizzBuzzBis(){
        List <String>  actual = List.of("1","2","Fizz");
        List<String> expected = FizzBuz.checkAlgoFizzBuzzArgJava8Bis(3);
        assertEquals(expected, actual);

    }

    @Test
    public void checkFizzOrBuzz(){
      //  String actual = "Fizz" ;
     //   String expected = FizzBuz.checkFizzOrBuzz(3);
     //   assertEquals(expected, actual);

    }
}
