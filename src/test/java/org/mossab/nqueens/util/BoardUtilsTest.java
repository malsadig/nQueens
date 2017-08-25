package org.mossab.nqueens.util;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by malsadig on 8/24/17.
 */
public class BoardUtilsTest {
    @Test
    public void testGetListsEvenLength() {
        Pair<List<Integer>, List<Integer>> lists = BoardUtils.getLists(8);
        List<Integer> odds = lists.getLeft();
        List<Integer> evens = lists.getRight();
        Assert.assertEquals(4, odds.size());
        Assert.assertEquals(4, evens.size());
        Assert.assertEquals(odds.toString(), "[1, 3, 5, 7]");
        Assert.assertEquals(evens.toString(), "[2, 4, 6, 8]");
    }

    @Test
    public void testGetListsOddLength() {
        Pair<List<Integer>, List<Integer>> lists = BoardUtils.getLists(9);
        List<Integer> odds = lists.getLeft();
        List<Integer> evens = lists.getRight();
        Assert.assertEquals(5, odds.size());
        Assert.assertEquals(4, evens.size());
        Assert.assertEquals(odds.toString(), "[1, 3, 5, 7, 9]");
        Assert.assertEquals(evens.toString(), "[2, 4, 6, 8]");
    }
}