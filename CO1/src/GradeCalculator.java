import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks :  ");
        int marks =  input.nextInt();

        if (marks < 0 || marks > 100){
            System.out.print("The entered marks are out of range");
        }
        else if (marks >= 90){
            System.out.print("You are awarded S grade");
        }

        else if (marks >= 80){
            System.out.print("You are awarded A grade");
        }

        else if (marks >= 70){
            System.out.print("You are awarded B grade");
        }

        else if (marks >= 60){
            System.out.print("You are awarded C grade");
        }

        else if (marks >= 55){
            System.out.print("You are awarded D grade");
        }

        else if (marks >= 50){
            System.out.print("You are awarded E grade");
        }

        else if (marks < 50) {
            System.out.print("You are awarded F grade");
        }


    }
}

