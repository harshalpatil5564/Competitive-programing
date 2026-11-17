// Problem: AGELIMIT
// Platform: codechef
// Language: import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int a = sc.nextInt();
    		// write your code here
		}
		
	}
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/java/PJA06/problems/AGELIMIT?tab=Help
// Solved on: 2026-11-17T17:21:19.796Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int a = sc.nextInt();
    		
    		// Check the eligibility criteria
    		if (a >= x && a < y) {
    		    System.out.println("YES");
    		} else {
    		    System.out.println("NO");
    		}
		}
		sc.close();
	}
}