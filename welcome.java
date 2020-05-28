import java.util.Scanner;

public class welcome {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );

        int number1;
        int number2;
        int sum;

        System.out.print("nummer1: ");
        number1 = input.nextInt();

        System.out.print("nummer2: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        if (sum > 10) {
            System.out.printf("%d is such a big number!\n", sum);    
        }
        System.out.printf("Sum is %d\n", sum);
    }
}