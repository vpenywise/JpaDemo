package com.vlado.demo.db.service.autowired.demo;

import java.math.BigInteger;

public final class BigIntFactorial {

    public static BigInteger iterative(int n) {
        validate(n);

        BigInteger fac = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;

    }

    public static BigInteger recursive(int n) {

        validate(n);

        if (n < 2)
            return BigInteger.ONE;
        else
            return (BigInteger.valueOf(n).multiply(recursive(n - 1)));
    }

    private static void validate(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument must be >= 0");
        }
    }

    ;
}