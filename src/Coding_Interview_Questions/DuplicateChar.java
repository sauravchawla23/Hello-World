package Coding_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        String s = "sauurravvb";

        Map<Character,Integer> m = new HashMap<>();

        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> s1 : m.entrySet()){
            if(s1.getValue()>1){
                System.out.println(s1.getKey()+" ");
            }
        }
    }
}
