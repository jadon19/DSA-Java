package Linear;
public class RadixSort {

    // Main Radix Sort function
    static void radixSort(int[] arr) {
        int max = getMax(arr);

        // Apply counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    // Counting Sort based on digit represented by exp
    static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // digits 0–9

        // 1. Count digit frequencies
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // 2. Prefix sum (positions)
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 3. Build output array (right to left → stable)
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            int pos = count[digit] - 1;
            output[pos] = arr[i];
            count[digit]--;
        }

        // 4. Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Utility function to get maximum element
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        radixSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
