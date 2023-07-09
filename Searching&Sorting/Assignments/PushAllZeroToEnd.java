package Assignments;


public class PushAllZeroToEnd {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static void pushAllZeroToEnd(int[] arr) {
        int n = arr.length, k = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,5,0,7};
        printArray(arr);
        pushAllZeroToEnd(arr);
        printArray(arr);
    }
}
