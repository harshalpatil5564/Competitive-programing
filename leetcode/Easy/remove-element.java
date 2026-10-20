// Problem: Remove Element
// Platform: leetcode
// Rating/Difficulty: Easy
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/remove-element/
// Solved on: 2026-10-20T17:46:43.479Z

class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}