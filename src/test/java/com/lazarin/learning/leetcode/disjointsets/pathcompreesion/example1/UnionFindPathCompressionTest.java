package com.lazarin.learning.leetcode.disjointsets.pathcompreesion.example1;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * {@link UnionFindPathCompression}
 */
public class UnionFindPathCompressionTest {

    @Test
    public void shouldTestIfNodesAreConnected(){

        UnionFindPathCompression uf = new UnionFindPathCompression(10);
        // 1-2-5-6-7 3-8-9 4
        uf.union(1, 2);
        uf.union(2, 5);
        uf.union(5, 6);
        uf.union(6, 7);
        uf.union(3, 8);
        uf.union(8, 9);

        assertThat(uf.connected(1,5), is(true));
        assertThat(uf.connected(5,7), is(true));
        assertThat(uf.connected(4,9), is(false));

        // 1-2-5-6-7 3-8-9-4
        uf.union(9, 4);
        assertThat(uf.connected(4,9), is(true));
    }
}
