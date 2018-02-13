package by.epam.preTraining.task4.controller;

import by.epam.preTraining.task4.model.*;
import by.epam.preTraining.task4.view.View;

/**
 * Created by karina on 13-02-2018.
 */
public class Controller {

    public static void main(String[] args) {
        runTask1();
        runTask2();
        runTask3();
        runTask4();
        runTask5();
    }

    private static void runTask1() {
        View.printTaskTitle(1);
        int n = 8911;
        View.printInput(n);
        View.print("Recursive digit sum: " + DigitSum.getDigitSumRecursive(n));
        View.print("Non-recursive digit sum: " + DigitSum.getDigitSum(n));
    }

    private static void runTask2() {
        View.printTaskTitle(2);
        double x = 2;
        int n = 10;
        View.printInput(x, n);
        View.print("Recursive pow: " + Power.powRecursive(x, n));
        View.print("Non-recursive pow: " + Power.pow(x, n));
    }

    private static void runTask3() {
        View.printTaskTitle(3);
        int N = 2256;
        int S = 15;
        View.printInput(N, S);
        View.print("Recursive equals: " + Equals.equalsRecursive(N, S));
        View.print("Non-recursive equals: " + Equals.equals(N, S));
    }

    private static void runTask4() {
        View.printTaskTitle(4);
        int n = 9;
        View.printInput(n);
        View.print("Recursive fibonacci: " + Fibonacci.getFibonacciRecursive(n));
        View.print("Non-recursive fibonacci: " + Fibonacci.getFibonacci(n));
    }

    private static void runTask5() {
        View.printTaskTitle(5);
        int n = 3;
        View.printInput(n);
        View.print("Recursive Hanoi towers: " + HanoiTower.calculateHanoiRecursive(n, "A", "B", "C"));
        View.print("Non-recursive Hanoi towers: " + HanoiTower.calculateHanoi(n, "A", "B", "C"));
    }
}