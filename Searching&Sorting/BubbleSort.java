public class BubbleSort {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static void bubbleSortAscendingOrder(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void bubbleSortDescendingOrder(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1;i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,8,1,5,7};
        printArray(arr);
        bubbleSortAscendingOrder(arr);
        printArray(arr);
        bubbleSortDescendingOrder(arr);
        printArray(arr);

    }
}

