package dssc.assignment.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Convert {
    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "41, 41"})
    void numbersNotMultiplesOf357ToStrings(int n, String expected) {
        assertEquals(expected, FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 24})
    void multiplesOf3ToFizz(int n) {
        assertEquals("Fizz", FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 100})
    void multiplesOf5ToBuzz(int n) {
        assertEquals("Buzz", FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {7, 14, 49})
    void multiplesOf7ToBang(int n) {
        assertEquals("Bang", FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void multiplesOf35ToFizzBuzz(int n) {
        assertEquals("FizzBuzz", FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {21, 42, 63})
    void multiplesOf37ToFizzBang(int n) {
        assertEquals("FizzBang", FizzBuzz.convert(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {35, 70})
    void multiplesOf57ToBuzzBang(int n) {
        assertEquals("BuzzBang", FizzBuzz.convert(n));
    }

    @Test
    void n105ToFizzBuzzBang() {
        assertEquals("FizzBuzzBang", FizzBuzz.convert(105));
    }
}
