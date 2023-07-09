package Assignments;

public class AddArrays {

    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public static void AddArrays(int[] array1, int[] array2) {
        int carry = 0;
        int s1 = array1.length;
        int s2 = array2.length;
        int[] result = new int[s1+1];
        int i = s1-1;
        int j = s2-1;
        int k = result.length - 1;
        while(j >= 0){
            int num = array1[i] + array2[j] + carry;
            result[k] = num % 10;
            carry = num / 10;
            i--;
            j--;
            k--;
        }
        while(i >= 0) {
            int num = array1[i] + carry;
            result[k] = num % 10;
            carry = num / 10;
            i--;
            k--;
        }
        result[0] = carry;
        printArray(result);
    }
    public static void main(String[] args) {
        //int[] arr1 = {1,2,3,4};
        //int[] arr2 = {1,2,3,4};
        int[] arr1 = {9,9,9,9};
        int[] arr2 = {1};
        printArray(arr1);
        printArray(arr2);
        System.out.println("----------------------");
        AddArrays(arr1, arr2);

        
    }
}
