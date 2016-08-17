package com.example.lesson33;

public class Factorial {
    public int countFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return countFactorial(number - 1) * number;
        }
    }
}
