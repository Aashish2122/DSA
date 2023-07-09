public class MergeTwoSortedArray {
    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[] arr3 = new int[m+n];
        int i =0,j=0, k = 0;
        while(i < m && j < n){
            if(arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < m) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        return arr3;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,6,10,13};
        int[] arr2 =  {2,5,7,9};
        System.out.print("Array 1: ");
        printArray(arr1);
        System.out.print("Array 2: ");
        printArray(arr2);    
        System.out.print("Merged Arrays: ");
        printArray(mergeTwoSortedArrays(arr1, arr2));
    }
    
}
