package Str;
public class Palindr {

    int resultStart;
    int resultLength;

    public int longestPalindrome(String s) {
        int strLength = s.length();
        if (strLength < 2) {
            return 1;
        }
        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength).length();
    }

    private void expandRange(String str, int begin, int end) {
        while (begin >= 0 && end < str.length() &&
                str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
    public static void main(String[] args){
        System.out.println(new Palindr().longestPalindrome("baba"));
    }
}