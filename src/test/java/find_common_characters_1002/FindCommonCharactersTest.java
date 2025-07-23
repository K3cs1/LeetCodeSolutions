package find_common_characters_1002;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharactersTest {

    // Instance of the class to be tested
    FindCommonCharacters finder = new FindCommonCharacters();

    @Test
    void testCommonChars() {
        assertEquals(List.of("e", "l", "l"), finder.commonChars(new String[]{"bella", "label", "roller"}));
        assertEquals(List.of("c", "o"), finder.commonChars(new String[]{"cool", "lock", "cook"}));
        assertEquals(List.of("a", "a"), finder.commonChars(new String[]{"aaa", "aaa", "aa"}));
    }

    @Test
    void testCommonCharsNoCommon() {
        assertEquals(List.of(), finder.commonChars(new String[]{"abc", "def", "ghi"}));
    }

    @Test
    void testCommonCharsSingleWord() {
        assertEquals(List.of("a", "p", "p", "l", "e"), finder.commonChars(new String[]{"apple"}));
    }

    @Test
    void testCommonCharsEmptyArray() {
        assertEquals(List.of(), finder.commonChars(new String[]{}));
    }

    @Test
    void testCommonCharsEmptyStrings() {
        assertEquals(List.of(), finder.commonChars(new String[]{"", "", ""}));
    }
}