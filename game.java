package jeevan;

import java.util.Scanner;

public class game {
	
	
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choculates = 13;
        int high = 3;
        int low = 1;

          System.out.println("-----------Welcome to the Game------------");
         System.out.println("Enter the name of Player 1: ");
         String first = sc.next();
         System.out.println("Enter the name of Player 2: ");
         String sec = sc.next();

        while (choculates > 0) {
         System.out.println(first + ", Take chocolates  (1-3): ");
         int take = sc.nextInt();

            if (take < low || take > high) {
                System.out.println("only you chose between 1 to 3 at the time");
                
            }

            choculates -= take;
            if (choculates == 0) {
                System.out.println(sec + " got the Chilli" + first + " wins----Thanks for Playing----");
                break;
            }

          System.out.println("Remaining Chocolates: [" + choculates+"]");

         System.out.println(sec + "Take chocolates  (1-3): ");
         int tak = sc.nextInt();

            if (tak < low || tak > high) {
                System.out.println("only you chose between 1 to 3 at the time");
               
            }

            choculates -= tak;
            if (choculates == 0) {
                System.out.println(first + " got the Chilli" + tak + " wins-----Thanks for Playing-----");
                break;
            }

            System.out.println("Remaining Chocolates: [" + choculates+"]");
        }
    }
}
