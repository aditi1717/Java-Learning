class AgnosticSearchInArray{
    public static void main(String[] args) {
        int[] arr={112,89,68,23,12,11,6,2};
        int target=68;
        int ans=agnosticSearch(arr,target);
        System.out.println(ans);
    }

    //agnostic search means first find out the array is in ascending order or descending order
     static int agnosticSearch(int[] arr, int target) {
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
        return -1;
    }


}
