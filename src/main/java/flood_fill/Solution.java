package flood_fill;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution {

    public static class Coordinate {
        int r, c;

        public Coordinate(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static List<List<Integer>> floodFill(int r, int c,
                                                int replacement, List<List<Integer>> image) {
        // WRITE YOUR BRILLIANT CODE HERE
        int numRows = image.size();
        int numCols = image.get(0).size();
        bfs(image, new Coordinate(r, c), replacement, numRows, numCols);
        return image;
    }

    private static List<Coordinate> getNeighbours(List<List<Integer>> image, Coordinate node,
                                                  int rootColor, int numRows, int numCols ) {
        List<Coordinate> neighbors = new ArrayList<>();
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};
        for (int i = 0; i < deltaRow.length; i++) {
            int neighborRow = node.r + deltaRow[i];
            int neighborCol = node.c + deltaCol[i];
            if (0 <= neighborRow && neighborRow < numRows
                    && 0 <= neighborCol && neighborCol< numCols) {
                if (image.get(neighborRow).get(neighborCol) == rootColor) {
                    neighbors.add( new Coordinate( neighborRow, neighborCol ) );
                }
            }
        }
        return neighbors;
    }

    private static void bfs(List<List<Integer>> image, Coordinate root, int replacementColor,
                            int numRows, int numCols) {
        Deque<Coordinate> queue = new ArrayDeque<>();
        queue.add(root);
        boolean[][] visited = new boolean[numRows][numCols];
        int rootColor = image.get(root.r).get(root.c);
        image.get(root.r).set(root.c, replacementColor); // replace root color
        visited[root.r][root.c] = true;
        while (!queue.isEmpty()) {
            Coordinate node = queue.pop();
            List<Coordinate> neighbors = getNeighbours(image, node, rootColor, numRows, numCols);
            for (Coordinate neighbor : neighbors) {
                if (visited[neighbor.r][neighbor.c]) {
                    continue;
                }
                image.get(neighbor.r).set(neighbor.c, replacementColor);
                queue.add(neighbor);
                visited[neighbor.r][neighbor.c] = true;
            }
        }
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int replacement = Integer.parseInt(scanner.nextLine());
        int imageLength = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> image = new ArrayList<>();
        for (int i = 0; i < imageLength; i++) {
            image.add(splitWords(scanner.nextLine()).stream()
                    .map(Integer::parseInt).collect( toList()));
        }
        scanner.close();
        List<List<Integer>> res = floodFill(r, c, replacement, image);
        for (List<Integer> row : res) {
            System.out.println(row.stream().map(String::valueOf).collect( joining(" ")));
        }
    }
}
