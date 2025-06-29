import java.util.Scanner;

public class IntrestCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the profit : ");
        double profit = input.nextDouble();

        System.out.print("Enter the rate of intrest : ");
        double intrest = input.nextDouble();

        System.out.print("Enter the time in years : ");
        double time = input.nextDouble();

        double simple_intrest = (profit * intrest * time) / 100;

        System.out.print("Simple intrest = " + simple_intrest);
        input.close();

    }
}