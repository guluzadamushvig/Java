package rotate2dmatrix90degree;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collection;

import java.util.Collections;

import java.util.List;

import java.util.Scanner;

import java.util.Random;

public class Rotate2DMatrix90degree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                matrix[i][j] = scanner.nextInt();

            }

        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                //System.out.print(matrix[j][m-1-i]);
                System.out.print(matrix[n - 1 - j][i]);

                System.out.print(" ");

            }

            System.out.println(" ");

        }

    }

}
