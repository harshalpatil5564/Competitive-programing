// Problem: DPNMAO03
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
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int presses = 0;
            int state = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == state) {
                    presses++;
                    state = 1 - state;
                }
            }
            System.out.println(presses);
        }
        sc.close();
    }
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/accenture-interview-questions/ACCNTRE05/problems/DPNMAO03?tab=solution
// Solved on: 2026-11-11T06:06:35.689Z

2
4
0 1 0 1
5
1 0 0 0 0