import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter some number");

//        implicit conversion of integer into float
//        float num=input.nextInt();

//        typecasting or explicit type conversion
//        compressing the bigger type into smaller type explicitly
//        int num= (int)(input.nextFloat());
//        int num=(int)(23.33f);
//          for int to btye
//        byte num=(byte)(23);
//        if it will exceed thw range of byte 256 it give num%256=num after converting int to byte
//        byte num=(byte)(258);
//        System.out.println("number is "+num);

//        automatic type promotion in expression
//        bbyte to int automatcially
//         byte b=16;
//         it will throgh an error beacuse when we do any evaluation with byte it automatially convert into int and the evaluation takes place in int so we have to store it in int
//         b=b+2;
//        so wite code is
//        b=(byte) (b+2);
//        System.out.println(b);


//        character to int
        int a='A';
        System.out.println(a);

    }
}
