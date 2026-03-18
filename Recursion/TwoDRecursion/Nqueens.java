package Recursion.TwoDRecursion;
public class Nqueens {
    static int N = 4;

    public static void main(String[] args) {
        int[] pos = new int[N];
        solve(0, pos);
    }

    static void solve(int row, int[] pos) {
        if (row == N) {
            printBoard(pos);
            System.out.println();
            return;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col, pos)) {
                pos[row] = col;
                solve(row + 1, pos);
            }
        }
    }

    static boolean isSafe(int row, int col, int[] pos) {
        for (int i = 0; i < row; i++) {
            if (pos[i] == col || Math.abs(row - i) == Math.abs(col - pos[i])) {
                return false;
            }
        }
        return true;
    }

    static void printBoard(int[] pos) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (pos[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
