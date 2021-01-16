package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter the secret code's length:");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String secretCode = "";
        //System.out.println(secretCode);
        if (len > 9){
            System.out.println("Error: can't generate a secret number with a length of "+ len +" because there aren't enough unique digits.");
        }
        else{
            secretCode = generateNum(len);
        System.out.println("Okay, let's start a game!");
        playGame(secretCode);}
        //System.out.println("");}

        /*
        String userGuess = sc.nextLine();
        int bull = 0;
        int cow = 0;

        for (int i = 0; i < secretCode.length(); i++){
            for (int j = 0; j < userGuess.length(); j++){
                if ((secretCode.charAt(i) == userGuess.charAt(j)) && i == j){
                    bull ++;
                }
                if ((secretCode.charAt(i) == userGuess.charAt(j)) && i != j){
                    cow++;
                }
            }
        }
            if (cow == 0 && bull == 0){
                System.out.println("Grade: None. The secret code is "+secretCode);
            }
            if (cow == 0 & bull != 0){
                System.out.println("Grade: "+bull+" bull(s). The secret code is "+secretCode+".");
            }
            if (bull == 0 & cow != 0){
                System.out.println("Grade: "+cow+" cow(s). The secret code is "+secretCode+".");
            }*/

    }
    public static String generateNum(int volume){
        String result = "";
        while(result.length() != volume) {
            // get nanosecond
            //long pseudoRandomNumber = System.nanoTime();
            Random rand = new Random();
            //long double_random=rand.nextLong() * 1000;
            int m = (int) Math.pow(10, volume - 1);
            long double_random = m + new Random().nextInt(9 * m);
            // reverse nanosecond and remove leading zeros
            String tempNumber = String.valueOf(Long.parseLong(new StringBuilder(String.valueOf(double_random)).reverse().toString()));

            // get unique numbers and form the result
            for (int i = 0; i < tempNumber.length(); i++) {
                if (!result.contains(String.valueOf(tempNumber.charAt(i)))) {
                    result += String.valueOf(tempNumber.charAt(i));
                }
                if (result.length() == volume) {
                    break;
                }
            }
        }
       return result;
    }
    public static void  playGame(String secretCode){
        Scanner sc = new Scanner(System.in);

        int bull;
        int cow;
        int turn = 1;
        do{
            System.out.println("Turn " +turn);
            String userGuess = sc.nextLine();
          /*  for (int i = 0; i < secretCode.length(); i++){
                for (int j = 0; j < userGuess.length(); j++){
                    if ((secretCode.charAt(i) == userGuess.charAt(j)) && i == j){
                        bull ++;
                    }
                    if ((secretCode.charAt(i) == userGuess.charAt(j)) && i != j){
                        cow++;
                    }
                }
            }
            if (cow == 0 && bull == 0){
                System.out.println("Grade: None");
            }
            if (cow == 0 & bull != 0){
                System.out.println("Grade: "+bull+" bull(s)");
            }
            if (bull == 0 & cow != 0){
                System.out.println("Grade: "+cow+" cow(s)");
            }
            if (bull != 0 & cow != 0){
                System.out.println("Grade: "+bull+" bull(s) and "+cow+" cow(s)");
            }
*/
          bull = computeBulls(secretCode,userGuess);
          cow = computeCows(secretCode,userGuess);
            //System.out.println();
            System.out.println("Grade: "+bull+" bull(s) and "+cow+" cow(s)");
            /*if (x == 0 && y == 0){
                System.out.println("Grade: None");
            }
            if (y == 0 & x != 0){
                System.out.println("Grade: "+bull+" bull(s)");
            }
            if (x == 0 & y != 0){
                System.out.println("Grade: "+cow+" cow(s)");
            }
            if (x != 0 & y != 0){
                System.out.println("Grade: "+bull+" bull(s) and "+cow+" cow(s)");
            }*/
            turn++;
        }while(bull != secretCode.length());

        System.out.println("Congratulations! You guessed the secret code.");

    }

    private static int computeCows(String num1, String num2) {
        int cowsCounter = 0;
        for (int i = 0; i < num1.length(); i++) {
            for (int j = 0; j < num2.length(); j++) {
                if (i != j) {
                    if (num1.charAt(i) == num2.charAt(j)) {
                        cowsCounter++;
                    }
                }
            }
        }
        return cowsCounter;
    }

    private static int computeBulls(String num1, String num2) {
        int bullCounter = 0;

        for (int i = 0; i < num1.length(); i++) {
            if (num1.charAt(i) == num2.charAt(i)) {
                bullCounter++;
            }
        }
        return bullCounter;
    }
}
