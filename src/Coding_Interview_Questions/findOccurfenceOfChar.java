package Coding_Interview_Questions;

import java.util.*;

public class findOccurfenceOfChar {
    //ex aaaabbccc - a4b2c3d1
    public static void main(String[] args) {
        //normal way
        String s = "aaaabbcccd";
        int count =1 ;
        int i;
        for( i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else if(s.charAt(i)!=s.charAt(i+1)){
                System.out.print(s.charAt(i)+""+count);
                count =1;
            }
        }
        System.out.print(s.charAt(i)+""+count);
        System.out.println();

        //using hashmap in key value pair
        String s1 = "aaaabbcccdee";
        Map<Character,Integer> m = new HashMap<>();
        for(int j=0;j<s1.length();j++){

            m.put(s1.charAt(j), m.getOrDefault(s1.charAt(j), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
//        ChatGPT said:
//
//👉 m.getOrDefault(s1.charAt(j), 0) + 1 means:
//
//        s1.charAt(j) → takes one character from the string.
//
//        m.getOrDefault(s1.charAt(j), 0) → checks if that character is already in the map:
//
//        If yes, it returns its current count.
//
//        If no, it returns 0 (the default value).
//
//        + 1 → increases the count by 1.
//
//✅ In simple words:
//        This line counts how many times each character appears in the string.
    }
}
