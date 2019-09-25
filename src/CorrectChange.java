import java.util.Scanner;
/*
Jodie Azar
September 24,2019
 */

public class CorrectChange {
    public static void main(String[] args) {

        Scanner kb= new Scanner(System.in);
        int dollar= 100;
        int quarter= 25;
        int dime= 10;
        int nickle= 5;
        int penny= 1;

        System.out.println("please enter a whole number of cents:");
        int usertotal= kb.nextInt();
        int userdollar= usertotal/dollar;
        int totaldollars= usertotal%100; // finds the remainder.
        int userquarter= totaldollars/quarter;
        int totalquarters= totaldollars%25;
        int userdime= totalquarters/dime;
        int totaldimes= totalquarters%10;
        int usernickle= totaldimes/nickle;
        int totalnickles= totaldimes%5;
        int totalpennies= totalnickles;

        System.out.print("You have ");
        System.out.print(userdollar+ " dollars, ");
        System.out.print(userquarter+ " quarters, ");
        System.out.print(userdime+ " dimes, ");
        System.out.print(usernickle+ " nickles, and ");
        System.out.print(totalpennies+ " pennies.");




    }
}
