package homeworkweek7;
/* Write a program that tells us input value is number or an alphabet or symbol*/

import java.util.Scanner;

public class Program12 {

    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any char :");
        ch = s.next().charAt(0);
        if ((ch >= 'a' && ch <= 'Z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "is Alphabit");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is Digit");

        } else {
            System.out.println(ch + "  is special symbole");


        }

    }

}
