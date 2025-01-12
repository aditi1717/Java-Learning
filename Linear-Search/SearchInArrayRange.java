class SearchInArrayRange{
    public static void main(String[] args) {
        int[] arr={23,45,12,56,44,89,53,22,66};
        int target=23;
        boolean ans=searchElement(arr,target,2,5);
        System.out.println(ans);
    }
    static boolean searchElement(int[] arr, int target,int start,int end) {
        if(arr.length<0){
            return false;
        }
        for (int i = start; i <=end; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

}
