import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to verify : ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println(number + " is Even");
        }
        else{
            System.out.println(number + " is Odd");
        }

        input.close();
    }
}
