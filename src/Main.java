

public class Main {
    public static void main(String[] args) {

        // Bubble Sort Test
        int[] bubbleArr = {64, 25, 12, 22, 11};
        System.out.println("Before Bubble Sort:");
        printArray(bubbleArr);
        BubbleSort.sort(bubbleArr);
        System.out.println("After Bubble Sort:");
        printArray(bubbleArr);


        // Quick Sort Test
        int[] quickArr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("\nBefore Quick Sort:");
        printArray(quickArr);
        QuickSort.sort(quickArr, 0, quickArr.length - 1);
        System.out.println("After Quick Sort:");
        printArray(quickArr);

        // Insertion Sort Test
        int[] insertionArr = {5, 2, 9, 1, 5, 6};
        System.out.println("\nBefore Insertion Sort:");
        printArray(insertionArr);
        InsertionSort.sort(insertionArr);
        System.out.println("After Insertion Sort:");
        printArray(insertionArr);


        // Selection Sort Test
        int[] Selectionarr = {64, 25, 12, 22, 11};
        System.out.println("\nBefore Selection array:");
        printArray(Selectionarr);
        SelectionSort.sort(Selectionarr);
        System.out.println(" After Sorted array:");
        printArray(Selectionarr);







    }
        // Utility method to print arrays
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();


    }
}
