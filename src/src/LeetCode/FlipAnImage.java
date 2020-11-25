package LeetCode;

public class FlipAnImage {
    public static int[][] flipAndInvertImage(int[][] A) {
        int flippedImage[][] = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = A[i].length - 1; j >= 0; j--) {
                flippedImage[i][A[i].length - j - 1] = A[i][j];
            }
        }

        for (int i = 0; i < flippedImage.length; i++) {
            for (int j = 0; j < flippedImage[0].length; j++) {
                if (flippedImage[i][j] == 1) {
                    flippedImage[i][j] = 0;
                }
                else{
                    flippedImage[i][j] = 1;
                }
            }

        }
        return flippedImage;
    }

    public static void main(String[] args) {
        int temp[][] = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        print(temp);
        int answer[][] = flipAndInvertImage(temp);
        System.out.println("ANSWER ");
        print(answer);
    }

    private static void print(int[][] temp) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}
