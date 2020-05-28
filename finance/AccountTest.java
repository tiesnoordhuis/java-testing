package finance;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account( 50.00 );
        Account account2 = new Account( 7.53 );

        System.out.printf("account 1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account 2 balance: %.2f\n", account2.getBalance());

        Scanner input = new Scanner( System.in );

        double depositAmount;

        System.out.print( "enter deposit amount for account 1: " );
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account 1\n", depositAmount);
        account1.credit(depositAmount);

        System.out.print( "enter deposit amount for account 2: " );
        depositAmount = input.nextDouble();
        System.out.printf("adding %.2f to account 2\n", depositAmount);
        account2.credit(depositAmount);

        System.out.printf("account 1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account 2 balance: %.2f\n", account2.getBalance());
    }
}