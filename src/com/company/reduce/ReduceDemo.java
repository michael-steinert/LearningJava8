package com.company.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 1, 3);

        /* mapToInt() transforms a Stream<Object> to a Stream<int>*/
        int sum = integerList.stream().mapToInt(value -> value).sum();
        System.out.println(sum);

        /* reduce() combines a Stream of Int and produces a aggregated Result */
        Integer reduceSum = integerList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Integer maxValue = integerList.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxValue);
    }
}
