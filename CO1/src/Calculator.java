import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operation ('+', '-', '*', '/') : ");
        char operation = input.next().charAt(0);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        switch (operation){

            case('+'): result = num1 + num2; System.out.print("Answer : " + result); break;
            case('-'): result = num1 - num2; System.out.print("Answer : " + result ); break;
            case('*'): result = num1 * num2; System.out.print("Answer : " + result); break;
            case('/'): result = num1 / num2; System.out.print("Answer : " + result); break;

            default: System.out.println("Invalid numbers or operation.");

        }

    }
}
