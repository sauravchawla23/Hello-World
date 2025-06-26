package Coding_Interview_Questions;

public class Sum_of_Two_digit_target {
    // 1,2,3,4 ,5 target 7 - pairs are 2,5 and 3,4 solve this by two pointer approach
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 7;
        int s = 0 ;
        int e=arr.length-1;

        while (s<e){
            if(arr[s]+arr[e]==target){
                System.out.println(arr[s]+","+arr[e]);
                s++;
                e--;
            } else if (arr[s]+arr[e]<target) {
                s++;
            }else{
                e--;
            }
        }
    }
}
