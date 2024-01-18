package com.m3.fibonacci.fibonacci.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class FibonacciService {

    public BigInteger computeNextFibonacciNumber(BigInteger input) {
        if (input.compareTo(BigInteger.ONE) < 0) {
            return BigInteger.ONE; // Default to the first fibonacci number if input is below that
        }
        BigInteger firstNumber;
        BigInteger secondNumber = BigInteger.ONE;
        BigInteger nextNumber = BigInteger.TWO;

        while (nextNumber.compareTo(input) < 1) {
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber.add(secondNumber);
        }
        return nextNumber;
    }

}
