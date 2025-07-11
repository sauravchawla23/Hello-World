package Coding_Interview_Questions;

public class palindrome {
    public static void main(String[] args) {

        // for string
        String s = "aabaa";
        String ans = "";

        for(int i=s.length()-1;i>=0;i--){
            ans = ans + s.charAt(i);
        }
        if(s.equals(ans)){
            System.out.println("palidrome");
        }else{
            System.out.println("not palindrome");
        }

        //for num
        int num = 1211;
        int num1 = num;
        int rev = 0;
        while(num>0){
            int m = num % 10;
            rev = rev*10 + m ;
            num= num/10;
        }
        if(rev==num1){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
