package character_counter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterCounterTest {

    private CharacterCounter characterCounter;

    @BeforeEach
    void setUp() {
        characterCounter = new CharacterCounter();
    }

    @Test
    void testCharacterCompressionWithRepeatingCharacters() {
        String input = "aaabbc";
        String expectedOutput = "a3b2c1";
        assertEquals(expectedOutput, characterCounter.getCharactersWithNumbers(input));
    }

    @Test
    void testCharacterCompressionWithSingleCharacter() {
        String input = "a";
        String expectedOutput = "a1";
        assertEquals(expectedOutput, characterCounter.getCharactersWithNumbers(input));
    }

    @Test
    void testCharacterCompressionWithNoRepeatingCharacters() {
        String input = "abc";
        String expectedOutput = "a1b1c1";
        assertEquals(expectedOutput, characterCounter.getCharactersWithNumbers(input));
    }

    @Test
    void testCharacterCompressionWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, characterCounter.getCharactersWithNumbers(input));
    }

    @Test
    void testCharacterCompressionWithNullInput() {
        String input = null;
        String expectedOutput = "";
        assertEquals(expectedOutput, characterCounter.getCharactersWithNumbers(input));
    }

}