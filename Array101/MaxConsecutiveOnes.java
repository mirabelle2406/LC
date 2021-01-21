/*
    Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

Note:

    The input array will only contain 0 and 1.
    The length of input array is a positive integer and will not exceed 10,000

*/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1};
        int max = findMaxConsecutiveOnes(arr);
        System.out.println(max);

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            // if the current element is 1, a streak starts
            if (nums[i] == 1) {
                temp++;
            // if the current element if 0, the streak breaks
            } else {
                temp = 0;
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}