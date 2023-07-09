package Assignments;

public class SecondLargestElement {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }

    public static int naiveSolution(int[] arr) {
        if(arr.length < 2) return Integer.MIN_VALUE;

        int largest,secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++) {
            largest = Integer.max(largest, arr[i]);
        }
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] != largest) {
                secondLargest = Integer.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;
    }

    public static int optimizedSolution(int[] arr) {
        if(arr.length < 2) return Integer.MIN_VALUE;

        int largest,secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        //int arr[] = {10,8,0,9,7,31};
        //int arr[] = {10,10,10};
        int arr[] = {10,8,0,9,7,31,31};


        
        System.out.println("Naive solution result: "+naiveSolution(arr)+"\n");
        System.out.println("Naive solution result: "+optimizedSolution(arr)+"\n");

        
    }
}
