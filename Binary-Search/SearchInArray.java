class SearchInArray{
    public static void main(String[] args) {
        int[] arr={12,34,37,44,56,66,68,77,79,112};
        int target=66;
        int ans=search(arr,target);
        System.out.println(ans);
    }

     static int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


