
public class SearchInArray{
    public static void main(String[] args) {
       int[] arr={23,45,12,56,44,89,53,22,66};
       int target=89;
       int ans=searchElement2(arr,target);
        System.out.println(ans);
    }

    //return the index if element found

//     static int searchElement1(int[] arr, int target) {
//        if(arr.length<0){
//            return -1;
//        }
//        for (int index = 0; index < arr.length; index++) {
//            if(arr[index]==target){
//                return index;
//            }
//        }
//        return -1;
//    }


    //element will return if element found
    static int searchElement2(int[] arr, int target) {
        if(arr.length<0){
            return Integer.MAX_VALUE;
        }
        for (int i : arr) {
            if (i == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

}
