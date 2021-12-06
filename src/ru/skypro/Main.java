package ru.skypro;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int[] nomberss1 = new int[]{1, 2, 3};
        double[] nomberss2 = new double[]{1.57, 7.654, 9.986};
        char[] nomberss3 = new char[]{72, 73, 74};

        // Задание 2
        for (int i = 0; i < nomberss1.length; i++) {
            if (i == nomberss1.length - 1) {
                System.out.println(nomberss1[i]);
            } else {
                System.out.print(nomberss1[i] + ", ");
            }

        }
        for (int i = 0; i < nomberss2.length; i++) {
            if (i == nomberss2.length - 1) {
                System.out.println(nomberss2[i]);
            } else {
                System.out.print(nomberss2[i] + ", ");
            }
        }
        for (int i = 0; i < nomberss3.length; i++) {
            if (i == nomberss3.length - 1) {
                System.out.println(nomberss3[i]);
            } else {
                System.out.print(nomberss3[i] + ", ");
            }
        }
        //Задание 3
        for (int i = nomberss1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(nomberss1[i] + ", ");
            } else {
                System.out.println(nomberss1[i]);
            }
        }
        for (int i = nomberss2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(nomberss2[i] + ", ");
            } else {
                System.out.println(nomberss2[i]);
            }
        }
        for (int i = nomberss3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(nomberss3[i] + ", ");
            } else {
                System.out.println(nomberss3[i]);
            }
        }
        //Задание 4
        for (int i = 0; i < nomberss1.length; i++) {
            if (nomberss1[i] % 2 != 0) {
                nomberss1[i] = nomberss1[i] + 1;
                System.out.print(nomberss1[i]+ ", ");
            } else {
                System.out.print(nomberss1[i] + ", ");
            }
            }
        }
    }





    




















