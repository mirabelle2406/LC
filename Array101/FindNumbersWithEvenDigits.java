/*
      Find Numbers with Even Number of Digits
        Given an array nums of integers, return how many of them contain an even number of digits. 
        Constraints:

        1 <= nums.length <= 500
        1 <= nums[i] <= 10^5

*/
public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] / 100000 != 0) {
                temp++;
            } else {
                if (nums[i] / 1000 != 0 && nums[i] / 1000 < 10) {
                    temp++;
                } else if (nums[i] / 1000 == 0) {
                    if (nums[i] / 10 != 0 && nums[i] / 10 < 10) {
                        temp++;
                    }
                }
            }
        }
        return temp;
    }
}
