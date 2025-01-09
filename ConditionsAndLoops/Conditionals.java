
public class Conditionals {
    public static void main(String[] args) {

        int salary=2500;
//        if-else
//        if(salary>1000){
//            salary=salary+1000;
//        }
//        else{
//            salary=salary+0;
//        }

//        multiple if-else statement
        if(salary>5000){
            salary=salary+1000;
        }
        else if(salary>2000){
            salary=salary+500;
        }
        else{
            salary=salary+200;
        }
        
        System.out.println(salary);
    }
}
