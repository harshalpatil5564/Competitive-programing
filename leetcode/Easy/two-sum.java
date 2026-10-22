// Problem: Two Sum
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/two-sum/
// Solved on: 2026-10-22T17:37:12.175Z

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int temp=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                
                if(nums[i]+nums[j]==target){
                    return new int [] {i,j};
                }
            }
        }
        return new int[] {}; 
    }
   
}