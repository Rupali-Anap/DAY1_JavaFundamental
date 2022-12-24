package com.bridgelabz.fundamentals;
import java.util.Scanner;
public class SumOfCommandLine {

        public static void main(String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any Number: ");
            int s = sc.nextInt();
            int r = sc.nextInt();
            int sum = s + r;
            System.out.println("Sum is " + sum);
        }
    }

