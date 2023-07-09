package Assignments;

public class Sort012 {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static void sortNaive(int[] arr) {
        int[] tempArr = new int[arr.length];
        int nZero = 0;
        int nTwo = tempArr.length-1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                tempArr[nZero] = arr[i];
                nZero++;
            } else if (arr[i] == 2) {
                tempArr[nTwo] = arr[i];
                nTwo--;
            }
        }
        for(int i = nZero; i <=nTwo;i++ ) {
            tempArr[i] = 1;
        }
        System.out.println("------------------");
        printArray(tempArr);
        System.out.println("------------------");
    }

    public static void optimizedSolution(int[] arr) {
        int nZero = 0;
        int nTwo = arr.length-1;
        int i = 0;
        while( i <= nTwo) {
            if(arr[i] == 0) {
                int temp = arr[nZero];
                arr[nZero] = arr[i];
                arr[i] = temp;
                i++;
                nZero++;
            } else if (arr[i] == 2) {
                int temp = arr[nTwo];
                arr[nTwo] = arr[i];
                arr[i] = temp;
                nTwo--;
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,1,2,2,1,0};
        printArray(arr);
        optimizedSolution(arr);
        printArray(arr);

    }
}
