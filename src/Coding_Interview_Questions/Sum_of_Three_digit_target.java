package Coding_Interview_Questions;

import java.util.Arrays;

public class Sum_of_Three_digit_target {
    //0,1,2,3,4,5 target 7 - pairs are 1,2,4 and 0,3,4 and 0,2,5 solve this by two pointer approach
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,4,5};
        Arrays.sort(arr);
        int target = 7;

        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            // Step 2: Apply two-pointer
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println(arr[i] + "," + arr[left] + "," + arr[right]);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }


    }
}
