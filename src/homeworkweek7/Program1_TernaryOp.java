package homeworkweek7;

/* 1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)
*/

import java.util.Scanner;

public class Program1_TernaryOp {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = a.nextInt();

        String evenOdd = (num % 2 == 0) ?  "even" : "Odd";

        System.out.println(num + " is " +evenOdd);

    }

}
