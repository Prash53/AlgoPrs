package Str;

import java.util.HashSet;

public class Longsubst {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> subChar = new HashSet<Character>();
        char[] cha = s.toCharArray();
        int j=0;
        int i=j;
        int maxLen =0;
        String temp = new String();
        StringBuilder sb = new StringBuilder(temp);
        if(s.length()<1)
            return s.length();
        while (true) {
            if (maxLen < s.length() - j) {
                if (subChar.add(cha[i])) {
                    sb.append(cha[i]);
                    i++;
                    if(i==s.length())
                        return sb.length();
                } else {
                    maxLen = Math.max(maxLen,sb.length());
                    j++;
                    if (j == s.length() - 1)
                        return maxLen;
                    i = j;
                    sb.delete(0,sb.length());
                    subChar.clear();
                   // break;
                }
            }
            else
                return maxLen;
        }
      //  return maxLen;
    }
    public static void main(String[] args){
        System.out.println(new Longsubst().lengthOfLongestSubstring(" "));
    }
}
