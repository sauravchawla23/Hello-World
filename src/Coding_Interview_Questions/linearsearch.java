package Coding_Interview_Questions;

public class linearsearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //find 5 at return its index

        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                System.out.println(i);
            }
        }
    }
}
