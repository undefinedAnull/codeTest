package test.code;

/**
 *For a given string that only contains alphabet characters a-z, if 3 or more consecutive
 * characters are identical, remove them from the string. Repeat this process until
 * there is no more than 3 identical characters sitting besides each other.
 * Example:
 * Input: aabcccbbad
 * Output:
 * -> aabbbad
 * -> aaad
 * -> d
 */
public class CodeTest {

    public static String removeConsecutiveChars(String input) {

        StringBuilder sb = new StringBuilder(input);
        int i = 0;
        while  (i< sb.length() - 2) {
            if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i) == sb.charAt(i + 2)) {
                int count = 3;
                while (i + count < sb.length() && sb.charAt(i) == sb.charAt(i + count)) {
                    count++;
                }
                sb.delete(i, i + count);
                i = Math.max(0, i - 2);
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    /*
     *
     * #Stage 2 - advanced requirement
     * Instead of removing the consecutively identical characters, replace them with a
     * single character that comes before it alphabetically.
     * Example:
     * ccc -> b
     * bbb -> a
     * Input: abcccbad
     * Output:
     * -> abbbad, ccc is replaced by b
     * -> aaad, bbb is replaced by a
     * -> d
     */
    public static String replaceConsecutiveChars(String input) {

        StringBuilder sb = new StringBuilder(input);
        int i = 0;
        while  (i< sb.length() - 2) {
            if (sb.charAt(i) == sb.charAt(i + 1) && sb.charAt(i) == sb.charAt(i + 2)) {
                char replacement = (char) (sb.charAt(i) - 1);
                if(replacement>=97){
                    sb.replace(i, i + 3, String.valueOf(replacement));
                    i = Math.max(0, i - 2);
                }else{
                    sb.replace(i, i + 3, "");
                    i = Math.max(0, i - 2);
                }
            }else {
                i++;
            }
        }
        return sb.toString();
    }
}
