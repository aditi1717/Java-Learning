
class CountEvenDigitNumInArray{
    public static void main(String[] args) {
        int[] arr={12,342,152,2345,1};

        int ans=CountNumbers(arr);
        System.out.println(ans);
    }


    //this function is counting the digits
   static int CountNumbers(int[]arr){
        int count=0;
       for (int i = 0; i <arr.length; i++) {
           if(Even(arr[i])){
               count++;
           }
       }
       return count;
   }

   //this function is testing that whether the number has even digits or not
     static boolean Even(int i) {
        if(digits(i)%2==0){
            return true;
        }
        return false;
    }

    //this function counting the digits
     static int digits(int i) {
        int count=0;
        while (i>0){
           count++;
           i/=10;
        }
        return count;
    }

}
