package Assignments;

public class RightRotation {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    
    public static void rotateBruteForce(int[] arr, int d) {
        int n = arr.length;
        int tempArr[] = new int[n-d];

        for(int i = 0; i < n-d; i++) {
            tempArr[i] = arr[i]; 
        }

        for(int i = n-d; i< n;i++) {
            arr[i - n + d] = arr[i];
        }

        for(int i = 0; i < n-d; i++) {
            arr[i+d] = tempArr[i];
        }

    }
    public static void rotateRecursively(int[] arr, int d) {
        for(int i = 0; i<d;i++) {
            rotateOne(arr);
        }
    }
    public static void rotateOptimised(int[] arr, int d) {
        int n = arr.length-1;
        reverse(arr, 0, n);
        reverse(arr, 0, n - d);
        reverse(arr,arr.length-d,n);
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
    

    public static void rotateOne(int[] arr) {
          int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0; i < arr.length;i++) {
            arr[i] = i+1;
        }
        printArray(arr);
        //rotateBruteForce(arr, 2);
        //rotateRecursively(arr, 2);
        rotateOptimised(arr, 2);
        printArray(arr);
    }
}
