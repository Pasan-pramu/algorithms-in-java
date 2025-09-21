public class SelectionSort {
    public static void sort(int[] arr) {
        // Sorting logic will go here

        int n = arr.length;

        for(int i =0 ; i < n-1 ; i++){
            // Find the minimum element in the remaining array

            int minIndex =i ;


            for(int j=i+1 ;j < n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j ;
                }
            }

            // Swap arr[minIndex] and arr[i]
            int temp = arr[minIndex];
            arr[minIndex] =arr[i];
            arr[i] = temp;

        }

    }
}
