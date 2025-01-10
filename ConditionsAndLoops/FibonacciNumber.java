import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbers you want in your fibonacci series ");
        int n=input.nextInt();

        int i=0;
        int j=1;
        int p=0;

        int count=2;
        while(count<n){
            p=i+j;
            i=j;
            j=p;
            count++;
        }
