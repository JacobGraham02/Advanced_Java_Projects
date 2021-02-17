package Streams_Lambdas;

import java.util.stream.IntStream;

public class Stuff {

    private void getTotal1_Through_10() {
//        int total = 0;
//        for (int i = 1; i <= 10; i++) {
//            total += i;
//        }
        IntStream.rangeClosed(1, 10).sum(); // Generates the sum of numbers 1 through 10
    }
    private int multiplyEachResultBy2() {
        return IntStream.rangeClosed(1, 10)
                .map((int x) -> {return x * 2;}) // Applies the given function (lambda) to all
                // elements of the stream.
                .sum();
    }
    private int filterValues() {
        return IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 ==0)
                .map (x -> x*3)
                .sum();
    }


    public static void main(String[] args) {
        Stuff s = new Stuff();
        System.out.println(s.filterValues());
    }
}
