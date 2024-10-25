public class BubbleSort {
    public void bubbleSort(int[] array) {
        int n = array.length;


        for (int i = 0; i < n - 1; i++) {
        
            for (int j = 0; j < n - 1 - i; j++) {
        
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] arr = {5, 3, 8, 4, 2};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sorter.bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

