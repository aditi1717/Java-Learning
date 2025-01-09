import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers ");
        float a=input.nextFloat();
        float b=input.nextFloat();
        float sum=a+b;
        System.out.println("Sum of numbers is "+sum);
    }
}
