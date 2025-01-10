import java.util.Scanner;

public class NestedSwitch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the emp id and department  ");
        int id=input.nextInt();
        String depart=input.next();
        
        //old style
        switch (id) {  //do alt enter to convert it into advanve switch
            case 1:
                System.out.println("Id is 1");
                break;
            case 2:
                System.out.println("Id is 2 ");
                break;
            case 3:
                System.out.println("id is 3");
                switch (depart) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Managment":
                        System.out.println("managment department");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Please enter valid id");
                break;
        }
  
        
        // advance switch statement
        switch (id) {  //do alt enter to convert it into advanve switch
            case 1 -> System.out.println("Id is 1");
            case 2 -> System.out.println("Id is 2 ");
            case 3 -> {
                System.out.println("id is 3");
                switch (depart) {
                    case "IT" -> System.out.println("IT department");
                    case "Managment" -> System.out.println("managment department");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Please enter valid id");
        }

    }
}
