package Coding_Interview_Questions;

import java.util.Arrays;

public class Anagram {

    public static String check(String s1, String s2){

        if(s1.length()!=s2.length()){
            return "No anagram";
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        int i = 0 ;
        for(i=0;i<charArray1.length;i++){
            if(charArray1[i]!=charArray2[i]){
                return "No anagram";
            }
        }
            return "anagram";
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "ollhe";
        String ans = check(s1, s2);
        System.out.println(ans);
    }
}
