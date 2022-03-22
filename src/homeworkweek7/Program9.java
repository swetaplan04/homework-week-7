package homeworkweek7;
/* Same as above program-8 using switch statement.*/


import java.util.Scanner;


public class Program9 {


    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        char ch = in.next().charAt(0);
        switch (ch) {
            case 'A':
                System.out.println("Amsterdam");
                break;

            case 'B':
                System.out.println("Bristol");
                break;

            case 'C':
                System.out.println("Croydon");
                break;

            case 'D':
                System.out.println("Dover");

                break;
            case 'E':
                System.out.println("Edingburgh");
                break;

            case 'F':
                System.out.println("Flokestone");
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}