// Problem: DPNMAO04
// Platform: codechef
// Language: import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int m = sc.nextInt();

            if (m == 0 || n == 0 || m > n) {
                System.out.println(0);
                continue;
            }

            Arrays.sort(arr);

            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i + m - 1 < n; i++) {
                int diff = arr[i + m - 1] - arr[i];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
            System.out.println(minDiff);
        }
        sc.close();
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/accenture-interview-questions/ACCNTRE05/problems/DPNMAO04?tab=solution
// Solved on: 2026-11-13T14:29:56.387Z

1
7
7 3 2 4 9 12 56
3