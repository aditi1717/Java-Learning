
public class CountNums {
    public static void main(String[] args) {
        int num=234521;
        int count=0;
        while(num>0){
            int rem=num%10; //give last digit
            if(rem==2){
                count++;
            }
            num=num/10;
        }

        System.out.println("2 appears "+count+" times");
    }
}
