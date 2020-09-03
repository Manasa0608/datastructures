package Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 5, 7, 8, 9, 2, 4, 6, 10};
        System.out.println("output should be \n8 9 2 4 6 10 1 3 5 7\n");
        leftRot(arr, 4);
    }

    public static void leftRot(int[] arr, int rotations) {
        int ans[] = new int[arr.length];
        int len = arr.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (i + rotations < len) {
                ans[j] = arr[i + rotations];
            } else {
                ans[j] = arr[i + rotations - len];
            }
            j++;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
