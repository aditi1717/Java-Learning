public class ReverseOfNumber{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number ");
        int num=input.nextInt();
        int ans=0;
        while(num>0){
            int rem=num%10; //give last digit
             ans=ans*10+rem;
            num=num/10;
        }

        System.out.println("Reverse of number is "+ans);
    }
}
