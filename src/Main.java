import java.util.Arrays;
public class Main {

    /*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *   Input: s = "anagram", t = "nagaram"
     *   Output: true
     * */

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        char[] charArrayS = s.toCharArray();
        Arrays.sort(charArrayS);
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayT);
        System.out.println(Arrays.equals(charArrayS, charArrayT));
    }
}