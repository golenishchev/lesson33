package com.example.lesson33;

public class Fibonacci {
    public int countFibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return countFibonacci(number - 1) + countFibonacci(number - 2);
        }
    }
}
