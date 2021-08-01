package org.kata;

public final class PrintedValue {

    private final boolean isFizz;
    private final boolean isBuzz;
    private final int value;
    private static final String FIZZ="Fizz";
    private static final String BUZZ="Buzz";
    private static final String FIZZBUZZ=FIZZ+BUZZ;

    public PrintedValue(int i) {
        isFizz = i % 3 == 0 || String.valueOf(i)
                .contains("3");
        isBuzz = i % 5 == 0 || String.valueOf(i)
                .contains("5");
        value=i;
    }

    public String toString(){
        if(isFizz && isBuzz){
            return FIZZBUZZ;
        } else if(isFizz){
            return FIZZ;
        } else if(isBuzz){
            return BUZZ;
        }
        return String.valueOf(value);
    }

}
