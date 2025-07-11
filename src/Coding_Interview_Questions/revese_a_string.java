package Coding_Interview_Questions;

public class revese_a_string {
    public static void main(String[] args) {
        String str = "saurav";
        String ans  = "";
        for(int i=0;i<str.length();i++){
            ans = str.charAt(i)+ans;
        }
        System.out.println(ans);

        //

        String str1 = "manisha";
        String ans1 = "";

        for(int i=str1.length()-1;i>=0;i--){
            ans1 = ans1 + str1.charAt(i);
        }
        System.out.println(ans1);


    }
}
