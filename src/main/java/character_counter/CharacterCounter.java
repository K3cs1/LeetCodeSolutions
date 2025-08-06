package character_counter;

/*
    String input param: "aabcccccaaa"
    Return "a2b1c5a3"
*/
public class CharacterCounter {

    public String getCharactersWithNumbers(String param) {
        if (param == null || param.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char[] paramChars = param.toCharArray();
        char prevChar = paramChars[0];
        int charCounter = 1;

        for (int i = 1; i < paramChars.length; i++) {
            char actualChar = paramChars[i];
            if (actualChar == prevChar) {
                charCounter++;
            } else {
                result.append(prevChar).append(charCounter);
                prevChar = actualChar;
                charCounter = 1;
            }
        }

        result.append(prevChar).append(charCounter);
        return result.toString();
    }

}
