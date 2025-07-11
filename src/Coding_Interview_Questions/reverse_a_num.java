package Coding_Interview_Questions;

public class reverse_a_num {
    public static void main(String[] args) {
        int n = 102340;
        int reverse = 0;

        while(n>0) {
            int m = n%10;
            reverse =  (reverse*10)+m;
            n= n /10;
        }
        System.out.println(reverse);
    }

}
