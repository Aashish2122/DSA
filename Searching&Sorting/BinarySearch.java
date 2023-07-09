class BinarySearch{
    public static int binarySearch(int[] arr, int key) {
        int start = 0, end = arr.length - 1,mid;

        while(start < end) {
            mid = start + ((end - start)/2);
            if(arr[mid] == key) return mid;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int key = 4;
        int[] arr = {1,4,6,10,15,20,21,24};
        int res = binarySearch(arr,key);
        String result =  (res == -1) ? ("Element not Found") : ("Element " + key + " Found at index: "+res);
        System.out.println(result);
        
        
    }
}