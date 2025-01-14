class FindFloor{
    public static void main(String[] args) {
        int[] arr={12,23,45,47,77};
        int target=24;
        int ans=findFloor(arr,target);
        System.out.println(ans);
    }

    //find floor of a number-largest number -greatest number smaller or eqaual to the target
     static int findFloor(int[] arr, int target) {
        boolean isAsc=arr[0]<arr[arr.length-1];
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return end;
    }

}
