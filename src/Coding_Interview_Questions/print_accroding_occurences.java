package Coding_Interview_Questions;

public class print_accroding_occurences {
    //a1b2c3 - abbccc

    public static void main(String[] args) {
       String s = "a1b2c3";
       for(int i=0;i<s.length();i=i+2){
         int num = Character.getNumericValue(s.charAt(i+1));
         for(int j=0;j<num;j++){
             System.out.print(s.charAt(i));
         }
       }
    }
}
