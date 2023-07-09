class SelectionSort{

    public static void printArray(int[] arr) {
        for(int x: arr) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
    public void selectionSortAscendingOrder(int[] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n - 1; i++ ) {
            int min = i;
            for(int j = i+1; j < n ; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }


    }

    public void selectionSortDecendingOrder(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            int max = i;
            for(int j = i + 1; j< n; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,7,6,5,3,4};
        printArray(arr);
        System.out.println("---------------------------");
        SelectionSort s = new SelectionSort();
        s.selectionSortAscendingOrder(arr);
        printArray(arr);
        System.out.println("---------------------------");
        s.selectionSortDecendingOrder(arr);
        printArray(arr);
        
    }
}