import java.util.Arrays;
/*
    Arrays are
 */

public class AllArrays {

    private static final AllArrays allArrays = new AllArrays();

    public static void main(String[] args) {
        allArrays.checkForDoubleDimension();
    }

    private void checkForSingleDimension() {
        int[] arr = {1,2,3,4};
        arr.clone();
        System.out.println(Arrays.toString(arr));
        // Doubling each element in the below func, we check if it affects our original array.
        this.takeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void checkForDoubleDimension() {
        int[][] arr = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(arr));
        // Doubling each element in the below func, we check if it affects our original array.
        this.takeArray(arr);
        System.out.println(Arrays.deepToString(arr));

    }

    private void takeArray(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            arr[i]*=2;
        }
    }
    private void takeArray(int[][] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j]*=2;
            }
        }
    }
}
