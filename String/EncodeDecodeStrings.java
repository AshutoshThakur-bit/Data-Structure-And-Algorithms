package String;

import java.util.*;

public class EncodeDecodeStrings {

    // Encode a list of strings to a single string
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decode a single string back to list of strings
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // Find the delimiter #
            int j = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, j));
            String str = s.substring(j + 1, j + 1 + length);
            result.add(str);
            i = j + 1 + length;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("hello", "world", "java");
        
        String encoded = encode(strs);
        System.out.println("Encoded string: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded list: " + decoded);
    }
}
