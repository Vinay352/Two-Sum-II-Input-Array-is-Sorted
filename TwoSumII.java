package Leetcode.Medium;

/**
 *
 * Author: Vinay Jain
 * Contact: vinay.j3097@gmail.com
 *
 * Question: Two Sum II - input array is sorted (https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 * Difficulty: Medium
 * Complexity: O(n)
 *
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers
 * be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 *
 *
 */

public class TwoSumII {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        // int[] nums = {-1, 0};

        // int[] nums = {2, 3, 4};

        int[] ans = twoSum(nums, 26);

        for(int i = 0; i < 2; i++){
            System.out.println(ans[i]);
        }

    }

    /**
     *
     * 2 pointer technique. 1 pointer from the left and other from right of array.
     * left pointer is incremented if array element at left pointer + array element
     * at right pointer < target, if sum is > target then riht pointer is decremented,
     * if equal both pointer locations are returned.
     *
     * @param numbers
     * @param target
     * @return
     */
    private static int[] twoSum(int[] numbers, int target) {

        int leftIndex = 0;
        int rightIndex = numbers.length - 1;

        int[] ans = new int[2];

        for(int i = 0; i < numbers.length; i++){

            if( numbers[leftIndex] + numbers[rightIndex] > target ){
                rightIndex--;
            }else if( numbers[leftIndex] + numbers[rightIndex] < target ){
                leftIndex++;
            }else{
                ans[0] = leftIndex + 1;
                ans[1] = rightIndex + 1;
            }

        }

        return ans;

    }

}
