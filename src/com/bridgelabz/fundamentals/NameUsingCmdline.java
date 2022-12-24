package com.bridgelabz.fundamentals;
import java.util.Scanner;

public class NameUsingCmdline {
            public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Write name here:- ");
            String str=sc.nextLine();
            System.out.println("Your given name is:- " +str);
        }
    }

