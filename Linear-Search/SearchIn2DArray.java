import java.util.Arrays;

class SearchIn2DArray{
    public static void main(String[] args) {
        int[][] arr={
                {23,42},
                {22,21,56,78,33},
                {45,66,1},
                {12,90,72}
        };
        int target=22;
        boolean ans=serachElement1(arr,target);
        System.out.println(ans);
        int[]a=serachElement2(arr,target);
        System.out.println(Arrays.toString(a));
    }


    //returning the boolean
   static boolean serachElement1(int[][]arr,int target){
        if(arr.length==0){
            return false;
        }
       for (int i = 0; i < arr.length ; i++) {
           for (int j = 0; j <arr[i].length; j++) {
               if(arr[i][j]==target){
                   return true;
               }
           }
       }
        return false;
   }

    //returning the array of row and column number

    static int[] serachElement2(int[][]arr,int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
