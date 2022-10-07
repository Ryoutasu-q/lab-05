public class Sorter {
    public static void sortAscending(final int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                }
            }
    
            if (minElementIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minElementIndex];
                arr[minElementIndex] = temp;
            }
        }
    }

    public static void sort(int[] x){
        sortAscending(x);
        for(int i=0 ; i<x.length;i++)
        System.out.print(x[i] + " ");
    }
public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6 };
    sort(arr);
}
    
}
