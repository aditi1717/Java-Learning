
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the character ");
        char ch=input.next().trim().charAt(0);  //it is takimg only the single value of string
        if (ch>='a' && ch<='z'){
            System.out.println("It is lowercase");
        }
        else{
            System.out.println("It is uppercase");
        }
    }
}
