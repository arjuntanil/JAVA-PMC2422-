import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial of a number : ");

        int number = input.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++){

            factorial *= i;
        }


        System.out.print("Factorial of " + number + " = " + factorial);

    }
}

