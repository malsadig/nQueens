package org.mossab.nqueens;

import java.util.ArrayList;
import java.util.List;

public class TightSolution {
    public void solve(int n) {
        boolean[][] board = new boolean[n][n];
        List<Integer> evens = new ArrayList<>(n / 2);
        List<Integer> odds = new ArrayList<>(n % 2 == 0 ? n / 2 : n / 2 + 1);
        for (int i = 0; i < n / 2; i++) {
            evens.add(2 * (i + 1));
            odds.add(2 * i + 1);
        }
        if (n % 2 != 0)
            odds.add(n);
        if (n % 6 == 2) {
            odds.set(0, 3);
            odds.set(1, 1);
            odds.add(odds.remove(2));
        }
        if (n % 6 == 3) {
            evens.add(evens.remove(0));
            odds.add(odds.remove(0));
            odds.add(odds.remove(0));
        }
        evens.addAll(odds);
        for (int index = 0; index < board.length; index++) {
            board[index][evens.get(index) - 1] = true;
        }
        System.out.println(evens); // solution in list form
    }
}