package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[12];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 12 целых чисел");
        for (int i = 0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                count++;
            }
        }

        int[] array1 = new int[count];

        count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                array1[count] = array[i];
                count++;
            }
        }

        for (int left = 0; left < array1.length; left++) {
            if (array1[left] > 0) {
                int value = array1[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < array1[i]) {
                        array1[i + 1] = array1[i];
                    } else {
                        break;
                    }
                }
                array1[i + 1] = value;
            }
        }

        count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                array[i] = array1[count];
                count++;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
}
