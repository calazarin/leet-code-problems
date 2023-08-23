package com.lazarin.learning.leetcode.disjointsets.pathcompreesion.example2;

import com.lazarin.learning.leetcode.disjointsets.pathcompreesion.example1.UnionFindPathCompression;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link DisjointSet}
 */
public class DisjointSetTest {

    @Test
    public void shouldTestIfNodesAreConnectedUsingUnionByRank(){

        DisjointSet ds = new DisjointSet(10);
        // 1-2-5-6-7 3-8-9 4
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 5);
        ds.unionByRank(5, 6);
        ds.unionByRank(6, 7);
        ds.unionByRank(3, 8);
        ds.unionByRank(8, 9);

        assertThat(ds.connected(1,5), is(true));
        assertThat(ds.connected(5,7), is(true));
        assertThat(ds.connected(4,9), is(false));

        // 1-2-5-6-7 3-8-9-4
        ds.unionByRank(9, 4);
        assertThat(ds.connected(4,9), is(true));
    }

    @Test
    public void shouldTestIfNodesAreConnectedUsingUnionBySize(){

        DisjointSet ds = new DisjointSet(10);
        // 1-2-5-6-7 3-8-9 4
        ds.unionBySize(1, 2);
        ds.unionBySize(2, 5);
        ds.unionBySize(5, 6);
        ds.unionBySize(6, 7);
        ds.unionBySize(3, 8);
        ds.unionBySize(8, 9);

        assertThat(ds.connected(1,5), is(true));
        assertThat(ds.connected(5,7), is(true));
        assertThat(ds.connected(4,9), is(false));

        // 1-2-5-6-7 3-8-9-4
        ds.unionBySize(9, 4);
        assertThat(ds.connected(4,9), is(true));
    }
}
