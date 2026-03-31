package Heaps;

public class HeapSortDemo {
    public static void main(String[] args) {
        HeapSortDemo obj = new HeapSortDemo();
        int[] arr = {10,20,15,30,40};
        obj.createHeap(arr,arr.length-1);
        for(int item:arr){
            System.out.println(item);
        }
        obj.heapSort(arr);
        for(int item:arr){
            System.out.println(item);
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] createHeap(int[] arr,int lastIndex) {
        for (int i = 1; i <= lastIndex; i++) {
            int j = i;

            while (j > 0) {
                int parent = (j - 1) / 2;

                if (arr[j] > arr[parent]) {
                    swap(arr, j,(j-1)/2);
                    j = parent;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public int[] heapSort(int[] arr){
        
        int j = arr.length-1;
        while(j!=0){
            swap(arr,0,j);
            j-=1;
            createHeap(arr,j);
        }
        return arr;
    }
}
