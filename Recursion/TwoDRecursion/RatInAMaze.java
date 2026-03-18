package Recursion.TwoDRecursion;

import java.util.*;

public class RatInAMaze {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int n = grid.length;
        List<String> res = new ArrayList<>();

        if (grid[0][0] == 1) {
            solve(0, 0, grid, n, "", res);
        }

        Collections.sort(res);
        for (String path : res) {
            System.out.println(path);
        }
    }

    static void solve(int i, int j, int[][] grid, int n, String path, List<String> res) {
        if (i == n - 1 && j == n - 1) {
            res.add(path);
            return;
        }

        grid[i][j] = 0;

        if (i + 1 < n && grid[i + 1][j] == 1) {
            solve(i + 1, j, grid, n, path + "D", res);
        }

        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
            solve(i, j - 1, grid, n, path + "L", res);
        }

        if (j + 1 < n && grid[i][j + 1] == 1) {
            solve(i, j + 1, grid, n, path + "R", res);
        }

        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
            solve(i - 1, j, grid, n, path + "U", res);
        }

        grid[i][j] = 1;
    }
}
