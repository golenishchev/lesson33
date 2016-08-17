package com.example.lesson33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial of what number do you want to get");
        System.out.println("How much numbers of Fibonacci sequence do you want to get");
        int number = scanner.nextInt();

        Factorial myFactorial = new Factorial();
        System.out.println("Factorial is: " + myFactorial.countFactorial(number));

        Fibonacci myFibonacci = new Fibonacci();
        System.out.print("Fibonacci sequence: ");
        for(int i = 1; i < 15; i++) {
            int result = myFibonacci.countFibonacci(i);
            System.out.print(result + " ");
        }
    }
}
