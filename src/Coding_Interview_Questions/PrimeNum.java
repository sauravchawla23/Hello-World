package Coding_Interview_Questions;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 21 ;
        int i;
        for(i=2;i<n;i++){
            if(17%i==0){
                System.out.println("Not prime");
                break;
            }
        }
        if(i==n){
            System.out.println("Prime");
        }


        // print 1 to 100

        for(int j=1;j<=100;j++){
            int k ;
            for(k=2;k<j;k++){
                if(j%k==0){
                    break;
                }
            }
            if(k==j){
                System.out.print(j+" ");
            }
        }
    }
}
