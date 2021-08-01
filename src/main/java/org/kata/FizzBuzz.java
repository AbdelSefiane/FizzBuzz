package org.kata;

public class FizzBuzz {

    public static final String FIZZ_VALUE = "Fizz";
    public static final String BUZZ_VALUE = "Buzz";
    public static final String FIZZ_BUZZ_VALUE = FIZZ_VALUE + BUZZ_VALUE;

    public String print(int i) {
        String returnedValue = String.valueOf(i);
        if (isFizz(i)) {
            returnedValue = FIZZ_VALUE;
        }
        if (isBuzz(i) && returnedValue.equals(FIZZ_VALUE)) {
            returnedValue += BUZZ_VALUE;
        } else if (isBuzz(i)) {
            returnedValue = BUZZ_VALUE;
        }
        return returnedValue;
    }

    private boolean isBuzz(int i) {
        return String.valueOf(i)
                .contains("5") || i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return String.valueOf(i)
                .contains("3") || i % 3 == 0;
    }
}
