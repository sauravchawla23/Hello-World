package Coding_Interview_Questions;

public class binary_search {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int target = 5;
        int ans = binary_search(arr,target);
        System.out.println(ans);
    }
    public static int binary_search(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end--;
            }else{
                start++;
            }
        }
        return -1;

    }


}
