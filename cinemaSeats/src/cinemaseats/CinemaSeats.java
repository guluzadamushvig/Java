package cinemaseats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class CinemaSeats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numberOfRows = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int numberOfSeats = sc.nextInt();
        int totalSeats = numberOfRows * numberOfSeats;
        int totalIncome = 0;
        int numberOfFrontRows = (numberOfRows) / 2;
        int numberOfBackRows = numberOfRows - numberOfFrontRows;
        int seatPrice;

        if (totalSeats <= 60) {
            totalIncome = totalSeats * 10;
        } else if (totalSeats > 60) {
            totalIncome = (numberOfFrontRows * numberOfSeats * 10) + (numberOfBackRows * numberOfSeats * 8);
        }
        //System.out.println("Total Income:");
        //System.out.println("$"+totalIncome);
        cinemaSeats(numberOfRows, numberOfSeats);

        System.out.println();

        System.out.println("Enter a row number:");
        int rowNumber = sc.nextInt();

        System.out.println("Enter a seat number in that row:");
        int seatNumber = sc.nextInt();

        if (totalSeats <= 60) {
            seatPrice = 10;
        } else if (totalSeats > 60 && rowNumber <= numberOfFrontRows) {
            seatPrice = 10;
        } else {
            seatPrice = 8;
        }

        System.out.println();

        System.out.println("Ticket price: " + "$" + seatPrice);

        System.out.println();

        cinemaReserve(numberOfRows, numberOfSeats, rowNumber, seatNumber);

    }

    static int cinemaSeats(int a, int b) {
        for (int i = 0; i < a + 1; i++) {
            if (i == 0) {
                System.out.println("Cinema:");
                System.out.print(" ");
            } else {
                System.out.print(i);
            }

            for (int j = 1; j < b + 1; j++) {

                if (i == 0) {
                    System.out.print(" " + j);
                } else {
                    System.out.print(" S");
                }
            }
            System.out.println();
        }
        return 88;
    }

    static void cinemaSeat(int a, int b) {

        System.out.println("Cinema:");
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < b + 1; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(" ");
                } else if (i == 0) {
                    System.out.print(j);
                } else if (j == 0) {
                    System.out.print(i);
                } else {
                    System.out.print("S");
                }

                if (j < b - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static int cinemaReserve(int a, int b, int c, int d) {
        for (int i = 0; i < a+1; i++) {
            if (i == 0) {
                System.out.println("Cinema:");
                System.out.print(" ");
            } else {
                System.out.print(i);
            }

            for (int j = 1; j < b+1; j++) {
                
                if (i == c && j == d) {
                    System.out.print(" ");
                    System.out.print("B");
                }
                else if (i == 0) {
                    System.out.print(" " + j);
                } else {
                    System.out.print(" S");
                }
            }
            System.out.println();
        }
        return 88;

    }
}
