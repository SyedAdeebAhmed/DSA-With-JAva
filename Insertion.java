public class Insertion {
    public void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; 
                j--;
            }
            array[j + 1] = key; 
        }
    }

    public static void main(String[] args) {
        Insertion in = new Insertion();
        int arr[] = {4, 2, 3, 1};

        in.InsertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}