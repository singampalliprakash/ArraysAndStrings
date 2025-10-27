package arraysAndStrings;

public class ArraySortedOrNotUsingRecursion {

	public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // recursive call
        return isSorted(arr, index + 1);
    }

    public static void main(Stringx[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 5, 3, 4};
        boolean result=isSorted(arr1, 0);
        System.out.println(result);
        
       
    }

}
