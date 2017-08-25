package org.mossab.nqueens;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by malsadig on 8/24/17.
 */
public class ApplicationTest {
    @Test
    public void testSolve8() {
        Board board = new Board(8);
        Application.solve(board);
        Assert.assertEquals(board.getSolution().toString(), "[2, 4, 6, 8, 3, 1, 7, 5]");
    }

    @Test
    public void testSolve14() {
        Board board = new Board(14);
        Application.solve(board);
        Assert.assertEquals(board.getSolution().toString(), "[2, 4, 6, 8, 10, 12, 14, 3, 1, 7, 9, 11, 13, 5]");
    }

    @Test
    public void testSolve15() {
        Board board = new Board(15);
        Application.solve(board);
        Assert.assertEquals(board.getSolution().toString(), "[4, 6, 8, 10, 12, 14, 2, 5, 7, 9, 11, 13, 15, 1, 3]");
    }

    @Test
    public void testSolve20() {
        Board board = new Board(20);
        Application.solve(board);
        Assert.assertEquals(board.getSolution().toString(),
                "[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 3, 1, 7, 9, 11, 13, 15, 17, 19, 5]");
    }
}