classFindMinimumInArray{
    public static void main(String[] args) {
        int[] arr={23,45,12,56,44,89,53,22,66};
        int ans=findMinimum2(arr);
        System.out.println("MInimum value is "+ans);
    }

    //normal for loop
    static int findMinimum(int[] arr) {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(min>arr[i]){
               min=arr[i];
           }
        }
        return min;
    }

    //advance for loop
    static int findMinimum2(int[] arr) {
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }

}
