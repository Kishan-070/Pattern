/*
    * * * *
    *     *
    *     *
    * * * *


* */

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = user.nextInt();
        System.out.println("Enter column: ");
        int column = user.nextInt();
        for (int i = 1 ; i<= row ;i++){
            for (int j = 1;j<=column ;j++){
                if (i == 1 || i==row||j == 1 || j== column)
                    System.out.print("* ");

                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
