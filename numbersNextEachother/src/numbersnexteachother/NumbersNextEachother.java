package numbersnexteachother;

//public class NumbersNextEachother {
import java.util.Arrays;

import java.util.Scanner;

class NumbersNextEachother {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        int[] array = new int[l];

        for (int i = 0; i < l; i++) {

            int t = sc.nextInt();

            array[i] = t;

        }

        int firstNumber = sc.nextInt();

        int secondNumber = sc.nextInt();

        boolean res = true;

        for (int j = 0; j < array.length - 1; j++) {

            if (array.length == 2) {

                if ((array[0] == firstNumber && array[1] == secondNumber)

                        || (array[0] == secondNumber && array[1] == firstNumber)) {

                    res = false;

                }

            } else if ((array[j] == firstNumber && array[j + 1] == secondNumber)

                    || (array[j] == secondNumber && array[j - 1] == firstNumber)

                    || (array[j] == secondNumber && array[j + 1] == firstNumber)) {

                res = false;

            }

        }

        System.out.println(res);

    }

}
