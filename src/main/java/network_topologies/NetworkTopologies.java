package network_topologies;

/**
 * Network topologies java interview exercise:
 * Given three types of Network topologies: Rig, Bus, Star
 * <p>
 * Example #1 Input parameters (Ring):
 * int input1: 3
 * int input2: 3
 * int[] input3: {1,2,3}
 * int[] input4: {2,3,1}
 * <p>
 * Output: 3 // Ring
 * <p>
 * Example #2 Input parameters (Bus):
 * int input1: 3
 * int input2: 2
 * int[] input3: {1,2}
 * int[] input4: {2,3}
 * <p>
 * Output: 2 // Bus
 * <p>
 * For Star topology, there was no example data.
 * <p>
 * Input3 size is input2 value. input4 size is input2 value.
 */
public class NetworkTopologies {

    public int getTopology(int param1, int param2, int[] param3, int[] param4) {
        // n: number of nodes
        // m: number of edges
        // a, b: edges (size m)

        if (param3.length == 0 || param4.length == 0) {
            return -1;
        }

        // Build degree array
        int[] degree = new int[param1 + 1]; // 1-based indexing
        for (int i = 0; i < param2; ++i) {
            degree[param3[i]]++;
            degree[param4[i]]++;
        }

        // Check Ring: all degrees == 2, edges == nodes, and single component
        boolean isRing = (param2 == param1);
        for (int i = 1; i <= param1 && isRing; ++i) {
            if (degree[i] != 2)
                isRing = false;
        }
        if (isRing && isConnected(param1, param2, param3, param4))
            return 3;

        // Check Bus: two degree 1, others degree 2, edges == nodes-1, and single component
        int degreeOne = 0, degreeTwo = 0;
        for (int i = 1; i <= param1; ++i) {
            if (degree[i] == 1)
                degreeOne++;
            else if (degree[i] == 2)
                degreeTwo++;
        }
        boolean isBus = (param2 == param1 - 1) && (degreeOne == 2) && (degreeTwo == param1 - 2);
        if (isBus && isConnected(param1, param2, param3, param4))
            return 2;

        // Check Star: one degree n-1, rest degree 1, edges == nodes-1
        int centerCount = 0, leafCount = 0;
        for (int i = 1; i <= param1; ++i) {
            if (degree[i] == param1 - 1)
                centerCount++;
            else if (degree[i] == 1)
                leafCount++;
        }
        boolean isStar = (param2 == param1 - 1) && (centerCount == 1) && (leafCount == param1 - 1);
        if (isStar)
            return 1;

        // Not a recognized topology
        return -1;
    }

    // Helper to check if the graph is a single connected component
    private boolean isConnected(int n, int m, int[] a, int[] b) {
        boolean[] visited = new boolean[n + 1];
        dfs(a[0], a, b, visited, n, m);

        // Check if all nodes with degree > 0 are visited
        for (int i = 1; i <= n; ++i) {
            if (!visited[i]) {
                // If this node had any edges, it must be visited
                for (int j = 0; j < m; ++j) {
                    if (a[j] == i || b[j] == i)
                        return false;
                }
            }
        }
        return true;
    }

    private void dfs(int node, int[] a, int[] b, boolean[] visited, int n, int m) {
        visited[node] = true;
        for (int i = 0; i < m; ++i) {
            if (a[i] == node && !visited[b[i]])
                dfs(b[i], a, b, visited, n, m);
            else if (b[i] == node && !visited[a[i]])
                dfs(a[i], a, b, visited, n, m);
        }
    }

}
