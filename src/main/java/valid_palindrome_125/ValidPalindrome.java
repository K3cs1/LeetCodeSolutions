package valid_palindrome_125;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left += 1;
            }
            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right -= 1;
            }
            if (Character.toLowerCase(chars[left]) !=
                    Character.toLowerCase(chars[right])) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }

}
