public class SwapWithtTwo{
    public static void main(String[] args){

        int num1 = 10;
        int num2 = 20;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("Value of num1 = " + num1);
        System.out.println("Value of num2 = " + num2);
    }
}
