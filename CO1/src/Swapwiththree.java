import java.util.Scanner;


public class Swapwiththree {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

    }
}
