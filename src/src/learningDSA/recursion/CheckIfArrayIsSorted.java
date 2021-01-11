package learningDSA.recursion;

public class CheckIfArrayIsSorted {
    static int count=0;
    public static void main(String[] args) {
        int arr[] = new int[]{6,7,8,9,10};
        System.out.println(checkArray(arr, arr.length));
        System.out.println("Recursions count : "+count);
    }

    private static boolean checkArray(int[] arr, int length) {
        if ( length == 0 || length == 1) {
            return true;
        }
        if(arr[length-1] > arr[length-2]){
            count++;
            return checkArray(arr, length-1);
        }
        return false;
    }
}
