
class FindCeiling{
    public static void main(String[] args) {
        int[] arr={12,23,45,47,77};
        int target=24;
        int ans=findCeiling(arr,target);
        System.out.println(ans);
    }

    //find ceiling of a number-smallest number which is larger than or equal to the target 
     static int findCeiling(int[] arr, int target) {
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            } 
            else if(target<arr[mid]){
                    end=mid-1;
                }
            else{
                    start=mid+1;
                }   
        }
        return start;
    }

}
