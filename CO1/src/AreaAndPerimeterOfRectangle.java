import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of rectangele : ");
        int length = input.nextInt();

        System.out.println("Enter the breadth of the rectangle : ");
        int breadth = input.nextInt();

        int area = length * breadth;
        int perimeter = 2*(length + breadth);

        System.out.println("Area of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + perimeter);

    }
}
