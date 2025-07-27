package network_topologies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NetworkTopologiesTest {

    @Test
    void testInvalidTopologyDisconnected() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 4;
        int m = 2;
        int[] a = {1, 2};
        int[] b = {3, 4}; // This is a disconnected graph
        assertEquals(-1, topologies.getTopology(n, m, a, b));
    }

    @Test
    void testInvalidTopologyMultipleEdges() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 3;
        int m = 3;
        int[] a = {1, 2, 2};
        int[] b = {2, 1, 3}; // Graph has multiple edges between 1 and 2
        assertEquals(-1, topologies.getTopology(n, m, a, b));
    }

    @Test
    void testInvalidTopologySingleNode() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 1;
        int m = 0;
        int[] a = {};
        int[] b = {}; // Single node, no edges
        assertEquals(-1, topologies.getTopology(n, m, a, b));
    }

    @Test
    void testInvalidTopologyLoop() {
        NetworkTopologies topologies = new NetworkTopologies();
        int n = 2;
        int m = 1;
        int[] a = {1};
        int[] b = {1}; // Self-loop
        assertEquals(-1, topologies.getTopology(n, m, a, b));
    }

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