package org.mossab.nqueens.util;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malsadig on 8/24/17.
 */
public class BoardUtils {
    /***
     * The algorithm calls for two lists, one of all even numbers up to n, the board length, and
     * one of all the odd numbers up to n.
     *
     * @param length the length of the side of the given board
     * @return this function returns the list of list of odds and the list of evens
     * as a Pair
     */
    public static Pair<List<Integer>, List<Integer>> getLists(int length) {
        int dividedLength = length / 2;
        List<Integer> evens = new ArrayList<>(dividedLength);
        // must account for floor division
        List<Integer> odds = new ArrayList<>(length % 2 == 0 ? dividedLength : dividedLength + 1);

        for (int i = 0; i < dividedLength; i++) {
            evens.add(2 * (i + 1));
            odds.add(2 * i + 1);
        }

        if (length % 2 != 0) {
            odds.add(length);
        }

        return new ImmutablePair<>(odds, evens);
    }
}
