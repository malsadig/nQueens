package org.mossab.nqueens;

import org.apache.commons.lang3.tuple.Pair;
import org.mossab.nqueens.util.BoardUtils;
import org.mossab.nqueens.util.PrintUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malsadig on 8/24/17.
 * <p>
 * Written according to the algorithm provided by
 * https://en.wikipedia.org/wiki/Eight_queens_puzzle#Explicit_solutions
 */
public class Application {
    public static void main(String... args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Length of board must be specified");
        }

        int length = Integer.parseInt(args[0]);
        Board board = new Board(length);
        solve(board);
        PrintUtils.printBoard(board);
    }

    /***
     * Algorithm to solve n queens, for visibility and clarity, courtesy of wikipedia:
     * <p>
     * 1. If the remainder from dividing N by 6 is not 2 or 3,
     * then the list is simply all even numbers followed by all odd numbers
     * not greater than N.
     * 2. Otherwise, write separate lists of even and odd numbers (i. e. 2, 4, 6,
     * 8 — 1, 3, 5, 7).
     * 3. If the remainder is 2, swap 1 and 3 in odd list and move 5 to the
     * end (i. e. 3, 1, 7, 5).
     * 4. If the remainder is 3, move 2 to the end of even list and 1,3 to the end
     * of odd list (i. e. 4, 6, 8, 2 — 5, 7, 1, 3).
     * 5. Append odd list to the even list and place queens in the rows given by
     * these numbers, from left to right (i. e. a2, b4, c6, d8, e3, f1, g7, h5).
     *
     * @param board the Board object constructed from the given input of a length
     */
    public static void solve(Board board) {
        int n = board.getLength();

        Pair<List<Integer>, List<Integer>> lists = BoardUtils.getLists(n);

        if (n % 6 == 2) {
            // swap 1 and 3
            lists.getLeft().set(0, 3);
            lists.getLeft().set(1, 1);

            // move 5 to the end
            lists.getLeft().add(lists.getLeft().remove(2));
        }

        if (n % 6 == 3) {
            // move 2 to the end of even list
            lists.getRight().remove(0);
            lists.getRight().add(2);

            // move 1, 3 to the end of odd list
            lists.getLeft().removeIf(i -> i <= 3);
            lists.getLeft().add(1);
            lists.getLeft().add(3);
        }
        // append the odd list to the even list
        lists.getRight().addAll(lists.getLeft());

        board.setSolution(lists.getRight());
        board.applySolution();
    }
}