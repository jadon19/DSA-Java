package Recursion.Backtracking;

public class SubsequenceSumK {

    static int count = 0;

    static void countSubseq(int[] arr, int index, int sum, int k) {

        if (index == arr.length) {
            if (sum == k) {
                count++;
            }
            return;
        }

        // take element
        countSubseq(arr, index + 1, sum + arr[index], k);

        // skip element
        countSubseq(arr, index + 1, sum, k);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1};
        int k = 2;

        countSubseq(arr, 0, 0, k);

        System.out.println(count);
    }
}
