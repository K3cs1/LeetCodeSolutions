package climbing_stairs_70;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testClimbStairs1() {
        assertEquals(1, climbingStairs.climbStairs(1));
    }

    @Test
    void testClimbStairs2() {
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    void testClimbStairs3() {
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    void testClimbStairs4() {
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Test
    void testClimbStairs5() {
        assertEquals(8, climbingStairs.climbStairs(5));
    }
}