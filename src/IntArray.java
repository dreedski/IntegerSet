package com.company;

import java.util.Arrays;
import java.util.Random;

public class IntArray {
    private int[] intArray;

    public IntArray(int size) {
        Random randArray = new Random();
        intArray = new int[size];

        intArray[0] = 0;
        for (int i = 0; i < size; i++) {
            intArray[i] = randArray.nextInt(50);
        }

        System.out.println("Set: " + Arrays.toString(intArray));

    }

    public int[] getIntArray() {
        return intArray;
    }

    public static class IntMath {
        double average;
        int sum;
        int even;
        int odd;
        int max;
        int min;
        int size;
        int[] intArray;

        public IntMath(int[] intArray) {
            this.intArray = intArray;
        }

        public double average() {
            average = 0;
            double total = 0;
            for (int i = 0; i < intArray.length; i++) {
                total += intArray[i];
            }

            average = total / intArray.length;

            return average;
        }


        public int sum() {
            sum = 0;
            for (int i = 0; i < intArray.length; i++) {
                sum += intArray[i];
            }
            return sum;
        }

        public int even() {
            even = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] % 2 == 0) {
                    even++;
                }
            }
            return even;
        }

        public int odd() {
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] % 2 != 0) {
                    this.odd++;
                }
            }
            return odd;
        }

        public int max() {
            max = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
            return max;
        }

        public int min() {
            min = intArray[0];
            for(int i = 1; i < intArray.length; i++){
                if(intArray[i] < min){
                    min = intArray[i];
                }
            }
            return min;
        }

        public int size() {
            size = intArray.length;
            return size;
        }

    }
}
