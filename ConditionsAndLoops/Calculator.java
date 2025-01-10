import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans=0;
        while (true){
            System.out.print("Enter the Operand and x to ternimate it  ");
            char op=input.next().trim().charAt(0);
            //check it is valid operand or not
            if(op=='+'||op=='-'||op=='*'||op=='%'||op=='/' ){
                System.out.println("Enter the numbers");
                int a=input.nextInt();
                int b=input.nextInt();

                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    ans=a/b;
                }
                if(op=='%'){
                    ans=a%b;
                }
                System.out.println("Answer is "+ans);

            }
            else if (op=='x'||op=='X') {
                break;
            }
             else{
                System.out.println("Enter the valid operand");
            }
        }

    }
}
