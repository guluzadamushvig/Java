/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createaneuphoniousword;

import java.util.Scanner;

/**
 *
 * @author mushu
 */
public class CreateAnEuphoniousWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String CONSONANTS = "bcdfghjklmnpqrstvwxz";
        String VOWELS = "aeiouy";
        int count = 0;


        for (int i = 1; i < input.length()-1; i++) {
            if (VOWELS.indexOf(input.charAt(i)) != -1
                    && VOWELS.indexOf(input.charAt(i - 1)) != -1
                    && VOWELS.indexOf(input.charAt(i + 1)) != -1
                    || CONSONANTS.indexOf(input.charAt(i)) != -1
                    && CONSONANTS.indexOf(input.charAt(i - 1)) != -1
                    && CONSONANTS.indexOf(input.charAt(i + 1)) != -1) {
            count++;
            i+=1;
            }
        }
        System.out.println(count);
    }
    
}
