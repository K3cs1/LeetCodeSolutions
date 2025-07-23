package valid_palindrome_125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(c) || Character.isDigit(c)) {
                sb.append(c);
            }
        }
        String original = sb.toString();
        return sb.reverse().toString().equalsIgnoreCase(original);
    }

}
