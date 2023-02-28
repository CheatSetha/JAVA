package LessonInClass.Arrays;

import java.util.Locale;
import java.util.Scanner;

public class GameGuesserName {
    public static void main (String[] args) {
        String input;//to hold the use input
        char check; // to hold that user want to check again or not
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter your name : ");
            input = userInput.nextLine().toLowerCase();
            int sum = 0;
            int number = 0;

            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case 'a', 'j', 's' -> number += 1;
                    case 'k', 'b', 't' -> number += 2;
                    case 'c', 'l', 'u' -> number += 3;
                    case 'd', 'm', 'v' -> number += 4;
                    case 'e', 'n', 'w' -> number += 5;
                    case 'f', 'o', 'x' -> number += 6;
                    case 'g', 'p', 'y' -> number += 7;
                    case 'h', 'q', 'z' -> number += 8;
                    case 'i', 'r' -> number += 9;
                    default -> number += 0;

                }
            }

            if (number>10){
                //convert to char
                char[] chars = String.valueOf(number).toCharArray();
                for (int i = 0; i <chars.length ; i++) {


                    sum=sum+Character.getNumericValue(chars[i]); //convert to int and calculate

                }
                System.out.println("អ្នកជាមនុស្សជំពូកលេខ: " +sum);
            }else {
                System.out.println("អ្នកជាមនុស្សជំពូកលេខ: " +number);//if number less than 10
            }

            System.out.println("Do You want to check again? press y for yes : ");
             check = userInput.nextLine().charAt(0);



        }while (check=='y' || check=='Y');

    }
}

