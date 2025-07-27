package network_topologies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkTopologiesTest {

    @Test
    void testRingTopology() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 3;
        int m = 3;
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 1}; // This forms a ring
        assertEquals(3, topologies.getTopology(n, m, a, b));
    }

    @Test
    void testBusTopology() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 4;
        int m = 3;
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4}; // This forms a bus
        assertEquals(2, topologies.getTopology(n, m, a, b));
    }

    @Test
    void testStarTopology() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 4;
        int m = 3;
        int[] a = {1, 1, 1};
        int[] b = {2, 3, 4}; // This forms a star
        assertEquals(1, topologies.getTopology(n, m, a, b));
    }

}