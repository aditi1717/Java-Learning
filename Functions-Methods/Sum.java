import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            sum();
            int ans2=sum2();
            System.out.println(ans2);
            int ans3=sum3(10,20);
        System.out.println(ans3);
        }
        static void sum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the first number");
            int n1=input.nextInt();
            System.out.println("Enter the second number");
            int n2=input.nextInt();
            int sum=n1+n2;
            System.out.println("Sum of two numbers is "+sum);
        }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1=input.nextInt();
        System.out.println("Enter the second number");
        int n2=input.nextInt();
        int sum=n1+n2;
        return sum;
    }

    static int sum3(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    }
