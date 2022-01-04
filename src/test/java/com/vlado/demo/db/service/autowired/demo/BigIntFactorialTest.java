package com.vlado.demo.db.service.autowired.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BigIntFactorialTest {


    @ParameterizedTest(name = "{0} = {1} = {2}={3}")
    @MethodSource("values")
    void iterativeNormal(int number, BigInteger expected,String someArg) {
        BigInteger iterative = BigIntFactorial.iterative(number);
        assertEquals(expected, iterative);
    }

    @ParameterizedTest(name = "{0} = {1} = {2}={3}={4}")
    @MethodSource("values")
    void думмъ(int number, BigInteger expected,String someArg, double someDouble, boolean istrue) {
        BigInteger iterative = BigIntFactorial.iterative(number);
        assertEquals(expected, iterative);
    }



    public static Stream<Arguments> values() {
        return Stream.of(
                //           {0},{1},            {2},       {3}, {4}
                Arguments.of(0, BigInteger.ONE, "Something",2.22,true),
                Arguments.of(1, BigInteger.ONE, "Other",1.1,true),
                Arguments.of(1, BigInteger.ONE, "Other",1.1,false));
    }

}