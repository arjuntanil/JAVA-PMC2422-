import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args){
        int result = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to print the table : ");
        int number = input.nextInt();

        for (int i = 1; result < (number*10); i++){

            result = number * i;
            count = count + 1;

            System.out.println(number + " * " + i + " = " + result );

        }

    }
}
