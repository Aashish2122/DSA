package Assignments;

public class LeftRotation {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public void rotateBruteForce(int[] arr, int d) {
        int[] tempArr = new int[d];
        int n = arr.length;
        
        for(int i = 0; i < d; i++) {
            tempArr[i] = arr[i];
        }

        for(int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for(int i = 0; i < d ; i++) {
            arr[i + n - d] = tempArr[i];
        }
    }

    public void rotateRecursively(int[] arr,int d) {
        for(int i = 0; i < d; i++) {
            rotateOne(arr);
        }
    }

    public void rotateOne(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = temp;
    }
    public static void reverse(int[] arr, int startIndex, int endIndex) {
        while(startIndex < endIndex) {
            //swapping 
            arr[startIndex] = arr[startIndex] + arr[endIndex];
            arr[endIndex] = arr[startIndex] - arr[endIndex];
            arr[startIndex] = arr[startIndex] - arr[endIndex];

            startIndex++;
            endIndex--;
        }
    }

    public static void rotateOptimised(int[] arr, int d) {
        int n = arr.length-1;
        reverse(arr, 0, n);
        reverse(arr, 0,d);
        reverse(arr,d+1,n);
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        LeftRotation lr = new LeftRotation();
        printArray(arr);
        //lr.rotateBruteForce(arr,3);
        //lr.rotateRecursively(arr, 3);
        rotateOptimised(arr, 2);
        printArray(arr);
    }
}
