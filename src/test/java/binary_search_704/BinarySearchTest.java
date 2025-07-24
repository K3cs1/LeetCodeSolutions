package binary_search_704;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void testTypicalCaseTargetExists() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(4, binarySearch.search(nums, 9)); // Target 9 is at index 4
    }

    @Test
    void testTargetDoesNotExist() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(-1, binarySearch.search(nums, 2)); // Target 2 is not in the array
    }

    @Test
    void testTargetIsFirstElement() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {2, 4, 6, 8, 10};
        assertEquals(0, binarySearch.search(nums, 2)); // Target 2 is at index 0
    }

    @Test
    void testTargetIsLastElement() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 3, 5, 7, 9};
        assertEquals(4, binarySearch.search(nums, 9)); // Target 9 is at index 4
    }

    @Test
    void testEmptyArray() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {};
        assertEquals(-1, binarySearch.search(nums, 10)); // Empty array should return -1
    }

    @Test
    void testArrayWithOneElementTargetMatches() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {5};
        assertEquals(0, binarySearch.search(nums, 5)); // Target 5 is at index 0
    }

    @Test
    void testArrayWithOneElementTargetDoesNotMatch() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {5};
        assertEquals(-1, binarySearch.search(nums, 3)); // Target 3 is not in the array
    }

    @Test
    void testTypicalCaseTargetIsFirst() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        assertEquals(0, binarySearch.search(nums, -1)); // Target -1 is at index 0
    }
}
