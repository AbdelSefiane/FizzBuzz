import org.assertj.core.api.Assertions;
import org.kata.FizzBuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public static Stream<Arguments> valueSource() {
        return IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    String s;
                    if ((i % 3 == 0 || String.valueOf(i)
                            .contains("3")) && (i % 5 == 0 || String.valueOf(i)
                            .contains("5")))
                        s = "FizzBuzz";
                    else {
                        if (i % 3 != 0 && !String.valueOf(i)
                                .contains("3")) {
                            if (i % 5 != 0 && !String.valueOf(i)
                                    .contains("5"))
                                s = String.valueOf(i);
                            else
                                s = "Buzz";
                        } else
                            s = "Fizz";
                    }
                    return Arguments.of(i, s);
                });
    }

    @ParameterizedTest
    @MethodSource(value = "valueSource")
    public void printshouldReturnNumberOrFizzOrBuzzOrFizzBuzz(int testedValue, String expectedAnswer) {
        String result = fizzBuzz.print(testedValue);
        Assertions.assertThat(result)
                .isEqualTo(expectedAnswer);
    }

}
