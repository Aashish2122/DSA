public class InsertionSort {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,7,6,8,4,5,2,3};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }
}
