
public class Sorting {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        //timeCompplexity = O(n^2)
        //Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        //timeCompplexity = O(n^2)
        //Selection Sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    smallest = j;
                }
            }
            //Swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        return arr;
    }

    //MERGE SORTING
    //Time Complexity = O(nlogn base 2)
    public static int[] conquere(int[] arr, int si, int mid, int ei) {
        int[] merger = new int[ei - si + 1];
        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;
        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merger[x++] = arr[indx1++];
            } else {
                merger[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid) {
            merger[x++] = arr[indx1++];
        }
        while (indx2 <= ei) {
            merger[x++] = arr[indx2++];
        }
        for (int i = 0, j = si; i <= merger.length-1;i++,j++){
            arr[j]=merger[i];    
        }
        return arr;
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquere(arr, si, mid, ei);
    }

    //QUICK SORTING
    //Time Complexity = O(logn)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < arr[pivot]) {
                i++;
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        int temp = arr[high];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pindx = partition(arr, low, high);
            quicksort(arr, low, pindx - 1);
            quicksort(arr, pindx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 2, 1};
        // printArray(bubbleSort(arr));
        // System.out.println();
        // printArray(selectionSort(arr));
        // System.out.println();
        // printArray(insertionSort(arr));
        // System.out.println();
        // // divide(arr, 0, arr.length - 1);
        // // printArray(arr);
        quicksort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
