package com.asgmt1;
import java.util.Scanner;

/**
 *
 * @author bahaa
 */
public class Asgmt1 {

    public static void main(String[] args) {
        System.out.print("Please Enter Number: ");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        
        Factorial factorial = new Factorial();
        factorial.setNum(num);
        System.out.println("Factorial Of " + num + "! is");
        factorial.getfNum();
    }
}
