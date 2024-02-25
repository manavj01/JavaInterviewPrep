package DSA.basic;

import java.util.Scanner;

public class Patterns {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
//        Patterns pts = new Patterns();
//        pts.pattern1(5);  to access a non static we create an object
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        pattern4b(5);

    }

    //*
    //**
    //***
    //****
    //*****

    public static void pattern1(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }


    //    *
    //   **
    //  ***
    // ****
    //*****

    public static void pattern2(int m) {
        for (int i = 0; i < m; i++) {
            for (int j = m - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*****
    // ****
    //  ***
    //   **
    //    *
    public static void pattern3(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //*        *  //2
    //**      **  //4
    //***    ***  //6
    //****  ****  //8
    //**********  //10
    public static void pattern4a(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4b(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)  // for stars
            {
                System.out.print("*");
            }
            for (int k = 2 * (n - i - 1); k > 0; k--) // for space
            {
                System.out.print(" ");
            }

            for (int z = 0; z <= i; z++) // for stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
