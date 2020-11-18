package dssc.assignment.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {

    public static void main(String... args) {
        print();
    }

    public static String convert(int n) {
        if (!(n % 3 == 0 || n % 5 == 0 || n % 7 == 0))
            return Integer.toString(n);

        String str = "";
        str += n % 3 == 0 ? "Fizz" : "";
        str += n % 5 == 0 ? "Buzz" : "";
        str += n % 7 == 0 ? "Bang" : "";
        return str;
    }

    public static void print() {
        Stream<String> fizzBuzzBangs = IntStream.rangeClosed(1, 105).mapToObj(FizzBuzz::convert);
        System.out.println(fizzBuzzBangs.collect(Collectors.joining(", ")));
    }

}
