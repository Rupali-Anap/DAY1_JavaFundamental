package com.bridgelabz.fundamentals;
import java.util.Scanner;
public class EqualString {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String s1 = sc.nextLine();
        System.out.println("Enter second String");
        String s2 = sc.nextLine();
        if (s1.equals(s2)){
            System.out.print("Strings are Equal");
        } else
            System.out.print("Strings are not Equal");
    }

}


