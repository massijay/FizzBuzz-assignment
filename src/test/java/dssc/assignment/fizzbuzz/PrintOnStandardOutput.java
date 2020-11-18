package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintOnStandardOutput {
    private static final String FIZZBUZZBANGS_1_TO_105 = "1, 2, Fizz, 4, Buzz, Fizz, Bang, 8, Fizz, Buzz, 11, Fizz, 13, Bang, FizzBuzz, 16, 17, Fizz, 19, Buzz, FizzBang, 22, 23, Fizz, Buzz, 26, Fizz, Bang, 29, FizzBuzz, 31, 32, Fizz, 34, BuzzBang, Fizz, 37, 38, Fizz, Buzz, 41, FizzBang, 43, 44, FizzBuzz, 46, 47, Fizz, Bang, Buzz, Fizz, 52, 53, Fizz, Buzz, Bang, Fizz, 58, 59, FizzBuzz, 61, 62, FizzBang, 64, Buzz, Fizz, 67, 68, Fizz, BuzzBang, 71, Fizz, 73, 74, FizzBuzz, 76, Bang, Fizz, 79, Buzz, Fizz, 82, 83, FizzBang, Buzz, 86, Fizz, 88, 89, FizzBuzz, Bang, 92, Fizz, 94, Buzz, Fizz, 97, Bang, Fizz, Buzz, 101, Fizz, 103, 104, FizzBuzzBang";

    @Test
    void numbersFrom1To105() {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));
        FizzBuzz.print();
        assertEquals(FIZZBUZZBANGS_1_TO_105 + System.lineSeparator(), fakeStandardOutput.toString());
    }
}
