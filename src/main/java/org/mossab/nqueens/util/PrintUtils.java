package org.mossab.nqueens.util;

import org.mossab.nqueens.Board;

/**
 * Created by malsadig on 8/24/17.
 * <p>
 * Simple utility class used to pretty-print the Board's.
 */
public class PrintUtils {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void printBoard(final Board board) {
        System.out.println(board.getSolution());
        boolean[][] queens = board.getBoard();

        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens[i].length; j++) {
                if (queens[i][j]) {
                    System.out.print(ANSI_RED + "Q " + ANSI_RESET);
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}