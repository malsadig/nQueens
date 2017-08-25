package org.mossab.nqueens;

import java.util.List;

/**
 * Created by malsadig on 8/24/17.
 * <p>
 * A wrapper around the boolean[][] board.
 * A boolean value of true at a given index indicates
 * the presence of a queen.
 */
public class Board {
    private int length;
    private boolean[][] board;
    private List<Integer> solution;

    public Board(int length) {
        if (length <= 3) {
            throw new IllegalArgumentException("Length of the board must be > 3.");
        }
        this.length = length;
        this.board = new boolean[length][length];
    }

    public int getLength() {
        return length;
    }

    public boolean[][] getBoard() {
        return board;
    }

    public void setSolution(List<Integer> solution) {
        this.solution = solution;
    }

    /**
     * @return the solution list. Especially used in testing.
     */
    public List<Integer> getSolution() {
        return solution;
    }

    /***
     * Iterates over the board, applying the position specified
     * by the solutions list to the proper index in the board.
     */
    public void applySolution() {
        if (this.solution == null) {
            return;
        }

        for (int index = 0; index < this.board.length; index++) {
            this.board[index][this.solution.get(index) - 1] = true;
        }
    }
}