/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class RotateArray {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    while(t-->0){
       int n = sc.nextInt();
       int d = sc.nextInt();
       int a[] = new int[n];
       for(int i=0; i<n; i++){
         a[i] = sc.nextInt(); 
       }
       int i=d;
       do {
         System.out.print(a[i]+" ");
         if(i==n-1) i=-1;
         i++;
       } while(i!=d);
       System.out.println();
     }
	}
}
