package org.me;

import java.util.stream.IntStream;

public class Fibb {

    public static Long fib(int n) {
        return fibInternal(1L, 0L, n);
    }

    static private Long fibInternal(long accu_1, long accu_2,int n) {
        if (n == 0)
            return 0L;
        else if (n == 1)
            return accu_1 + accu_2;
        else
            return fibInternal(accu_2, accu_2 + accu_1, n-1);
    }

    public static void main(String[] args) {
        IntStream.iterate(0, i -> i+1)
            .limit(10)
            .mapToLong(i -> fib(i))
            .forEach(System.out::println);
    }

}
