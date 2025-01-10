import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of fruit ");
        String fruit=input.next();
        switch (fruit) {  //do alt enter to convert it into advanve switch
            case "mango" -> System.out.println("King of fruits");
            case "grapes" -> System.out.println("small fruit");
            case "apple" -> System.out.println("A red and sweet fruit");
            case "banana" -> System.out.println("a sweet fruit");
            default -> System.out.println("Please enter valid fruit");
        }

    }
}
