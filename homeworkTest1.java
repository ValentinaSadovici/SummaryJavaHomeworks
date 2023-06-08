package homeworks._2023_06_02;

public class homeworkTest1 {

    // how to calculate the sum of the int numbers?
    private static int getsum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // how to calculate the Average of the float numbers?
    private static double getAverage(double[] arr) {
        double sum = 0;
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
        }
        return sum / arr.length;
    }

    //   return max of the int numbers
    private static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    //   return min of int numbers
    private static int getMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
//  how many negative numbers do we have
    private static int countNeg(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) count++;
        }
        return count;
    }
// find index and return the first value
    public static int findIndex(int[] arr, int element){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1 ;
    }
//
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, -4, 5, 6, 5, 4, -3, 2, -1};
        System.out.println(getsum(arr1));
        double[] arr2 = {1, 4, 6, 7, 4.5, 7.8, 3.2};
        System.out.println(getAverage(arr2));
        System.out.println(getMax(arr1));
        System.out.println(getMin(arr1));
        System.out.println(countNeg(arr1));
        System.out.println(findIndex(arr1, 5));
    }

}
