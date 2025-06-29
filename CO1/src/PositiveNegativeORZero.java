import java.util.Scanner;

public class PositiveNegativeORZero {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check : ");
        int num = input.nextInt();

        if (num < 0){
            System.out.print(num + " is a negative number");
        }

        else if (num == 0){
            System.out.print(num + " is zero");
        }

        else{
            System.out.print(num + " is a postive number");
        }

        input.close();
    }
}
