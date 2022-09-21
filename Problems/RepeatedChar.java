import java.util.Arrays;

public class RepeatedChar {
    public static void main(String[] args) {
        String s = "123572"; // f7aaaa555
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (!s2.contains(String.valueOf(s.charAt(i)))) {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j))
                        count++;
                }
                if (count == 1)
                    s1 += s.charAt(i);
                else {
                    while (count-- > 0) {
                        s2 += s.charAt(i);

                    }
                }
            }
        }
        System.out.println(s1 + s2);
    }
}
