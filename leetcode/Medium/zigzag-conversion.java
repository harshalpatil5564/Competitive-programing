// Problem: Zigzag Conversion
// Platform: leetcode
// Rating/Difficulty: Medium
// Language: java
// Verdict: Accepted
// URL: https://leetcode.com/problems/zigzag-conversion/
// Solved on: 2026-11-04T17:36:31.347Z

class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numRows; i++) {
            int idx = i;
            int deltaSouth = 2 * (numRows - 1 -i); // downMove
            int deltaNorth = 2 * i; // upMove
            boolean goingSouth = true;

            while(idx < s.length()) {
                sb.append(s.charAt(idx));

                if(i == 0) {
                    idx += deltaSouth;
                } else if(i == numRows - 1) {
                    idx += deltaNorth;
                } else {
                    if(goingSouth) {
                        idx += deltaSouth;
                    } else {
                        idx += deltaNorth;
                    }
                }

                goingSouth = !goingSouth;
            }
        }

        return sb.toString();
    }
}