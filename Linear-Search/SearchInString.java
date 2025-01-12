
public class SearchInString{
    public static void main(String[] args) {
       String str="Aditi";
       int target='w';
       boolean ans=searchCharacter2(str,target);
        System.out.println(ans);
    }

    //in normal for loop
     static boolean searchCharacter1(String str, int target) {
        if(str.length()==0){
            return false;
        }
         for (int i = 0; i <str.length() ; i++) {
             if(str.charAt(i)==target){
                 return true;
             }
         }
         return false;
    }


    //in enhanced for loop
    static boolean searchCharacter2(String str, int target) {
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

}
