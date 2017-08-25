package org.mossab.nqueens;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malsadig on 8/24/17.
 */
public class BoardTest {
    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        Board board = new Board(2);
    }

    @Test
    public void testSetAndApplySolutionCorrectly() {
        Board board = new Board(4);
        List<Integer> solution = new ArrayList<>();
        solution.add(4);
        solution.add(3);
        solution.add(2);
        solution.add(1);
        board.setSolution(solution);
        board.applySolution();

        Assert.assertTrue(board.getBoard()[0][3]);
        Assert.assertTrue(board.getBoard()[1][2]);
        Assert.assertTrue(board.getBoard()[2][1]);
        Assert.assertTrue(board.getBoard()[3][0]);
    }
}