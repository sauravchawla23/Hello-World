package Coding_Interview_Questions;

public class Binary_using_recursion {
        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11, 15};  // sorted array
            int target = 15;

            int index = binarySearch(arr, 0, arr.length - 1, target);

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }
        }

        public static int binarySearch(int[] arr, int start, int end, int target) {
            if (start > end) {
                return -1;  // base case: element not found
            }

            int mid = (start+end)/2;//start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;  // base case: element found
            } else if (target < arr[mid]) {
                return binarySearch(arr, start, mid - 1, target);  // search left
            } else {
                return binarySearch(arr, mid + 1, end, target);    // search right
            }
        }
    }


