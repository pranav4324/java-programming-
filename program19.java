public class program1 {
    public static void main(String[] args) {
        System.out.println("Bubble sort");
        // sorting algorithm //
        int[] arr = { 5, 2, 8, 1, 3 };
        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) { // n-1
            for (int j = 0; j < arr.length - i - 1; j++) { // n-i-1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Selection sort

        System.out.println("Selection Sort");
        int[] arr2 = { 64, 25, 12, 22, 11 };
        for (int i = 0; i < arr2.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[j] < arr2[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr2[minIdx];
            arr2[minIdx] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("Selection sort array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }

        // Insertion sort
        System.out.println("Insertion Sort");
        int[] arr3 = { 12, 11, 13, 5, 6 };
        for (int i = 1; i < arr3.length; i++) {
            int key = arr3[i];
            int j = i - 1;
            while (j >= 0 && arr3[j] > key) {
                arr3[j + 1] = arr3[j];
                j = j - 1;
            }
            arr3[j + 1] = key;
        }
        System.out.println("Insertion sort array:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
