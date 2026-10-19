// Problem: EXAMCHEF
// Platform: codechef
// Language: import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc = new Scanner(System.in);
int t =sc.nextInt();
while(t-->0){
        int x =sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int total=(z/x*y);
        if(total>=50){
                System.out.println("Yes");
        }
        else{
                System.out.println("No");
        }
}
	}
}
// Verdict: Accepted
// URL: https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/EXAMCHEF?tab=Help
// Solved on: 2026-10-19T16:59:47.127Z

4
2 10 12
2 10 3
1 5 3
3 6 9
