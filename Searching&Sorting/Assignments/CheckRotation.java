package Assignments;

public class CheckRotation {

    public static int check(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) return i+1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //int arr[] = {4,5,1,2,3};
        System.out.println(check(arr));
        
    }
}
