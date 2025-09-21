public class MergeSort {
    public static void sort(int[] arr){
            if(arr==null || arr.length<2 ) return;
            sort(arr,0,arr.length-1);


            public static void sort(int[] arr ,int left , int right){
                if(left<right){
                    int mid= left + (right-left)/2;

                    //sort left half
                    sort(arr,left,mid);

                    //sort Right half
                    sort(arr,mid+1,right);

                    //Merge Sorted Values
                    sort(arr,left,mid,right);

                }
        }
    }
}
