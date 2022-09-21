import java.util.*;

public class Anagram {

  /*
  */
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("cat", "act", "mam", "amm", "mouse","bed","deb"));
    Map<Integer, List<String>> map = new HashMap<>();

    int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
    for (int i = 0; i < list.size(); i++) {
      int mul = 1;
      String s = list.get(i);
      for (int j = 0; j < s.length(); j++) {
        mul *= arr[s.charAt(j) - 'a'];
      }
      if (map.containsKey(mul)) {
        map.get(mul).add(s);
      } else {
        map.put(mul, new ArrayList<>());
        map.get(mul).add(s);

      }

    }
    System.out.println(map.values());
  }
}
