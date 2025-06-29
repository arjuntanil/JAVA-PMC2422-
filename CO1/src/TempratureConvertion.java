import java.util.Scanner;

public class TempratureConvertion {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temprature in Fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double  celsius = (5/3) * (fahrenheit - 32);

        System.out.println("Celsius temprature = " + celsius );
    }
}
