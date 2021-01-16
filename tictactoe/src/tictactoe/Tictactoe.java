package tictactoe;

import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {

        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine();
        while (format.length() != 9) {
            System.out.print("Enter cells: ");
            if (scanner.hasNextLine()) {
                format = scanner.nextLine();
            }
        }

        char[][] resArray = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resArray[i][j] = format.charAt(i * 3 + j);
            }
        }

        print(resArray);
        printRes(resArray);
        /*int Xs = (countChar(format, 'X'));
        int Os = (countChar(format, 'O'));

        if (Xs + Os == 9){
            printRes(resArray);
        }

        if(Xs - Os > 1 || Os - Xs > 1){
            System.out.println("Impossible");
        }

        if(Xs + Os != 9){
            System.out.println("Game not finished");
        }

        else System.out.println("Draw");*/

    }

    static public void print(char[][] array) {
        System.out.println("-------");
        for (char[] array1 : array) {
            System.out.print("|" + " ");
            for (int j = 0; j < array[0].length; j++) {
                if (j < 2) {
                    System.out.print(array1[j] + " ");
                } else {
                    System.out.print(array1[j] + " ");
                    System.out.println("|");
                }
            }
        }
        System.out.println("-------");
    }

    static public void printRes(char[][] board) {
        int Xs = 0;
        int Os = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    Xs++;
                }
                if (board[i][j] == 'O') {
                    Os++;
                }
            }

        }

        //Check each row
        int resX = 0;
        int resO = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                //System.out.println(board[i][0] + " wins");
                if (board[i][0] == 'X') {
                    resX++;
                }
                if (board[i][0] == 'O') {
                    resO++;
                }
            }
            //else System.out.println("Draw");
        }
        //System.out.println(resX);

        //Check each column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                //System.out.println(board[0][j] + " wins");
                if (board[0][j] == 'X') {
                    resX++;
                }
                if (board[0][j] == 'O') {
                    resO++;
                }
            }
            //else System.out.println("Draw");
        }

        //Check the diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
            //System.out.println(board[0][0] + " wins");
            if (board[0][0] == 'X') {
                resX++;
            }
            if (board[0][0] == 'O') {
                resO++;
            }
        }
        //else System.out.println("Draw");
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-') {
            //System.out.println(board[2][0] + " wins");
            if (board[2][0] == 'X') {
                resX++;
            }
            if (board[2][0] == 'O') {
                resO++;
            }
        } else if ((Xs - Os > 1) || (Os - Xs > 1) || ((resX >= 1) && (resO >= 1))) {
            System.out.println("Impossible");
        } else if (((Xs + Os) != 9) && (resO == 0 && resX == 0)) {
            System.out.println("Game not finished");
        } else if ((Xs + Os) == 9 && (resO == 0 && resX == 0)) {
            System.out.println("Draw");
        } else if ((Xs - Os > 1 || Os - Xs > 1) && (resO != 0 && resX != 0)) {
            System.out.println("Impossible");
        }
        //--------------------
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-' && (resO == 0 || resX == 0)) {
                System.out.println(board[i][0] + " wins");

            }
        }

        //Check each column
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-' && (resO == 0 || resX == 0)) {
                System.out.println(board[0][j] + " wins");

            }

        }

        //Check the diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-' && (resO == 0 || resX == 0)) {
            System.out.println(board[0][0] + " wins");

        }
        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-' && (resO == 0 || resX == 0)) {
            System.out.println(board[2][0] + " wins");

        }

    }

    static int countChar(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }
}
