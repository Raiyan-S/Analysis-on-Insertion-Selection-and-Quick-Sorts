
import java.util.Scanner;

public class SortingAlgo {

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);

        int num = 0;
        while (num < 10) {
            System.out.print("Size of the array: ");
            num = read.nextInt();
            //array size must be 10 or more
            if (num < 10) {
                System.out.println("The array size must be 10 or more, Please try again");
            }
        }

        int[] originalArr = new int[num];

        //adding random numbers from 1 to 9999 in the array
        for (int i = 0; i < originalArr.length; i++) {
            originalArr[i] = 1 + (int) (Math.random() * 10000);
        }

        //print the original unsorted array
        for (int i = 0; i < originalArr.length; i++) {
            System.out.print(originalArr[i] + " ");
        }
        System.out.println("\n");

        //copy the original array to 3 arrays to sort them
        int[] insertArray = originalArr.clone();
        int[] selectionArray = originalArr.clone();
        int[] quicksortArray = originalArr.clone();

        //insertion sort
        long start = System.nanoTime();
        insertionSort(insertArray);
        long time = System.nanoTime() - start;
        double timeInSeconds = (double) time / 1000000000; //turn nanoseconds into seconds
        System.out.println("Insertion Sort time: " + timeInSeconds + " seconds");

        //print the sorted array
        for (int i = 0; i < originalArr.length; i++) {
            System.out.print(insertArray[i] + " ");
        }
        System.out.println("\n");

        //selection sort
        start = System.nanoTime();
        selectSort(selectionArray);
        time = System.nanoTime() - start;
        timeInSeconds = (double) time / 1000000000;
        System.out.println("Selection Sort time: " + timeInSeconds + " seconds");

        for (int i = 0; i < originalArr.length; i++) {
            System.out.print(selectionArray[i] + " ");
        }
        System.out.println("\n");

        //quick sort
        start = System.nanoTime();
        quickSort(quicksortArray, 0, quicksortArray.length - 1);
        time = System.nanoTime() - start;
        timeInSeconds = (double) time / 1000000000;
        System.out.println("Quick Sort time: " + timeInSeconds + " seconds");

        for (int i = 0; i < originalArr.length; i++) {
            System.out.print(quicksortArray[i] + " ");
        }
        System.out.println("\n");
    }

    //insertion sort method
    public static void insertionSort(int array[]) {

        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    //selection sort method
    public static void selectSort(int numArray[]) {
        int n = numArray.length;

        //traverse the unsorted array
        for (int i = 0; i < n - 1; i++) {
            //finding the minimum element in the unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (numArray[j] < numArray[min_idx]) {
                    min_idx = j;
                }
            }

            //swap minimum element with compared element
            int temp = numArray[min_idx];
            numArray[min_idx] = numArray[i];
            numArray[i] = temp;
        }
    }

    //quick sort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            //pIndex is partitioning index
            int pIndex = partition(arr, low, high);

            //recursion method until the subproblem is sorted
            quickSort(arr, low, pIndex - 1);
            quickSort(arr, pIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            //if current element is smaller than the pivot
            if (arr[j] < pivot) {

                //increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
