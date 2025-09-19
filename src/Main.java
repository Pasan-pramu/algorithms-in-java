

public class Main {
    public static void main(String[] args) {

        // Bubble Sort Test
        int[] bubbleArr = {64, 25, 12, 22, 11};
        System.out.println("Before Bubble Sort:");
        printArray(bubbleArr);
        BubbleSort.sort(bubbleArr);
        System.out.println("After Bubble Sort:");
        printArray(bubbleArr);

    }
        // Utility method to print arrays
        private static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();


    }
}
