package com.company;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println(45/0);
        int no = 0;
        while(true) {
            System.out.println("Please enter your roll no ?");
            try {
                no = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please input only Number !!");
                continue;
            }
        }
        System.out.println("your roll is: " + no);



	   // write your code here
        //System.out.println("hello world ! from github.com..");
        //System.out.print("###SANDESH LAMSAL##.");
        //System.out.println("Master Branch");
        //System.out.println("Java Automation\n");
        /*C
        //4/6/2020 2:20 pm
        int[] intArray={100,200,300};
        for (int a:intArray){
            System.out.println(a);
        }
        */
        //https://github.com/qalamsal/gitTest_HelloWorld_Project.git
    }
}
/*

print AmericanFlag

AmericanFlag.java

--------------------
---------------------


 */