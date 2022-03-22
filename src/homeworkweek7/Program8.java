package homeworkweek7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {

        String alphabet;
        System.out.println("Enter the alphabet from A To F");
        Scanner k = new Scanner(System.in);
        alphabet = k.nextLine();
        if (alphabet.equals("A")){
            System.out.println("City name is Anand");
        }
        else if(alphabet.equals("B")){
            System.out.println("City name is Baroda");
        }
        else if (alphabet.equals("C")){
            System.out.println("City name is Chandigard ");
        }
        else if (alphabet.equals("D")){
            System.out.println("City name is Delhi");
        }
        else if (alphabet.equals("E")){
            System.out.println("City name is Esnav");
        }
        else if (alphabet.equals("F")){
            System.out.println("City name is Faridabad");
        }
        else {
            System.out.println("Incorrect Alphabet");


        }


    }

}
