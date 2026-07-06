package number_of_islands;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

	@Test
	void singleCellLand() {
		assertEquals( 1, Solution.countNumberOfIslands( grid( new int[][]{ { 1 } } ) ) );
	}

	private static List<List<Integer>> grid( int[][] rows ) {
		List<List<Integer>> grid = new ArrayList<>();
		for ( int[] row : rows ) {
			List<Integer> cells = new ArrayList<>();
			for ( int cell : row ) {
				cells.add( cell );
			}
			grid.add( cells );
		}
		return grid;
	}

	@Test
	void singleCellWater() {
		assertEquals( 0, Solution.countNumberOfIslands( grid( new int[][]{ { 0 } } ) ) );
	}

	@Test
	void allWater() {
		assertEquals( 0, Solution.countNumberOfIslands( grid( new int[][]{
				{ 0, 0, 0 },
				{ 0, 0, 0 },
				{ 0, 0, 0 },
		} ) ) );
	}

	@Test
	void allLandSingleIsland() {
		assertEquals( 1, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 1, 1 },
				{ 1, 1, 1 },
				{ 1, 1, 1 },
		} ) ) );
	}

	@Test
	void classicSingleIsland() {
		assertEquals( 1, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 1, 1, 1, 0 },
				{ 1, 1, 0, 1, 0 },
				{ 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 },
		} ) ) );
	}

	@Test
	void classicThreeIslands() {
		assertEquals( 3, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 1, 0, 0, 0 },
				{ 1, 1, 0, 0, 0 },
				{ 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 1, 1 },
		} ) ) );
	}

	@Test
	void diagonalCellsAreSeparateIslands() {
		// diagonal adjacency does not connect cells
		assertEquals( 8, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 0, 1, 0, 1 },
				{ 0, 1, 0, 1, 0 },
				{ 1, 0, 1, 0, 1 },
		} ) ) );
	}

	@Test
	void checkerboardMaxIslands() {
		assertEquals( 5, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 0, 1 },
				{ 0, 1, 0 },
				{ 1, 0, 1 },
		} ) ) );
	}

	@Test
	void singleRow() {
		assertEquals( 2, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 1, 0, 1, 1 },
		} ) ) );
	}

	@Test
	void singleColumn() {
		assertEquals( 2, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1 },
				{ 1 },
				{ 0 },
				{ 1 },
		} ) ) );
	}

	@Test
	void uShapedIsland() {
		// connected land wrapping around a water pocket counts as one island
		assertEquals( 1, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 0, 1 },
				{ 1, 0, 1 },
				{ 1, 1, 1 },
		} ) ) );
	}

	@Test
	void borderLandTouchingEdges() {
		assertEquals( 1, Solution.countNumberOfIslands( grid( new int[][]{
				{ 1, 1, 1 },
				{ 1, 0, 1 },
				{ 1, 1, 1 },
		} ) ) );
	}
}
