package Coding_Interview_Questions;

import java.util.HashSet;

public class First_repeating_char {
    public static void main(String[] args) {

        String s = "saurav";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }


        // by using hashset as well we can do
        String s1 = "saurav";
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("First repeating character: " + c);
                return;
            }
            set.add(c);
        }
        System.out.println("No repeating characters found.");
    }
}
