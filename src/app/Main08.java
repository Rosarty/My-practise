package app;

import java.util.Scanner;

public class Main08 {
    static int[][] numlottery;
    private static final int WINTICKET = 60;

    public static void main(String[] args) {
        numlottery = new int[][]{
                {2, 5, 4, 5},
                {89, 53, 30, 21},
                {34, 54, 56, 43},
                {35, 45, 60, 59}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Find the winning ticket : ");
        int search = scanner.nextInt();

        int unknown = -1;
        for (int num = 0; num < numlottery.length; num++) {
            for (int num2 = 0; num2 < numlottery[num].length; num2++)
                if (numlottery[num][num2] == search) {
                    unknown = num;
                    break;
                }
        }
        if (unknown > -1 & search == WINTICKET)
            System.out.print("Ticket " + search + " is winning ");
        else
            System.out.print("Ticket " + search + " is losing ");

    }
}
