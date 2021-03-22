package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        com.company.IntArray mainArray = null;

        System.out.print("Please enter a number for the array size (zero or greater):  ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println("ERROR: Number must be at least zero!!!");
        } else {
            mainArray = new com.company.IntArray(n);
        }
        com.company.IntArray.IntMath intMath = new com.company.IntArray.IntMath(mainArray.getIntArray());


        System.out.printf("%-20s", "Average: ");
        System.out.println(intMath.average());
        System.out.printf("%-20s", "Even Count: ");
        System.out.println(intMath.even());
        System.out.printf("%-20s", "Odd Count: ");
        System.out.println(intMath.odd());
        System.out.printf("%-20s", "Min: ");
        System.out.println(intMath.min());
        System.out.printf("%-20s", "Max: ");
        System.out.println(intMath.max());
        System.out.printf("%-20s", "Size: ");
        System.out.println(intMath.size());
        System.out.printf("%-20s", "Sum: ");
        System.out.println(intMath.sum());
    }
}
