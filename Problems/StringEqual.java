import java.util.*;

class StringEqual {

    public static void main(String[] args) {
        String word = "maam";
        String word1 = "mma";
        String s1 = "";
        String s2 = "";
        int len1 = word.length() > word1.length() ? word.length() : word1.length();
        int len2 = word.length() < word1.length() ? word.length() : word1.length();
        if (len1 == word.length()) {
            s1 = word1;
            s2 = word;
        } else {
            s1 = word;
            s2 = word1;
        }
        int count = 0;
        System.out.println(s1 + " " + s2);
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        System.out.print((len1 + len2) - (count * 2));
    }

}
