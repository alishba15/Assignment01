

//Author : Alishba Idris
//Reg No. 01044
//Section : BSCS-2B
//Date: 18/03/2015.


import java.util.*;
public class AssemblyLine {
	
		 public static int assemble(int Array1[],int Array2[], int t1[], int t2[], int e1, int e2, int x1, int x2,int n)
		 {
			 
				 int f1[] = new int[n];
					int f2[] = new int[n];
					int line1[] = new int[n];
					int line2[] = new int[n];
					
					int f, line, a, k, c;
					

			 
		f1[0] = e1 + Array1[0];
		f2[0] = e2 + Array2[0];
	
		for(int j = 1; j < n; j++)
		{
			if((f1[j-1]+Array1[j]) <= (f2[j-1]+t2[j-1]+Array1[j]))
			{
				f1[j] = f1[j-1] + Array1[j];
				line1[j] =  1;
			}
			else 
	
			{
				f1[j] = f2[j-1] + t2[j-1] + Array1[j];
				line1[j] = 2;
			}
			
			
			
			if((f2[j-1]+Array2[j]) <= (f1[j-1]+t1[j-1]+Array2[j]))
			{
				f2[j] = f2[j-1] + Array2[j];
				line2[j] =  2;
			}
			else 
	
			{
				f2[j] = f1[j-1] + t1[j-1] + Array2[j];
				line2[j] = 1;
			}
			
		}
			
			if(f1[n-1] + x1 <= f2[n-1] + x2)
			{
				f = f1[n-1] + x1;
				line = 1;
			}
			else 
			{
				f = f2[n-1] + x2;
				line = 2;
			}
			a = line;
			
			System.out.println("First line:");
			for(int i = 0; i<=n-1 ; i++)
			{
				System.out.print(f1[i]+ " ");
			}
			
			System.out.println("\n\nSecond line:");
			for(int i = 0; i<=n-1 ; i++)
			{
				System.out.print(f2[i]+ " ");
			}
			
			System.out.print("\n\nline1:\n");
			for(int i=1;i<=n-1;i++)
			{
				System.out.print(line1[i]+ " ");
			}
			
			System.out.print("\n\nline2:\n");
			for(int i=1;i<=n-1;i++)
			{
				System.out.print(line2[i]+ " ");
			}
			
			
			System.out.print("\n\nOptimal cost:\n"+ f);
			System.out.print("\n\nOptimal line:\n"+ line + "\n");
			
			int b = line;
		
			System.out.println();

			for(int j=1;j<n;j++)
			{
				if(line == 1)
				{
					System.out.println("Station " + (j) + " of line " + line1[j] );
				}
				else
				{   
					System.out.println("Station " + (j) + " of line " + line2[j] );
					}
				a = j;
			}
				c = a+1;
				System.out.println("Station " + c + " of line " + b );
			
			return f;

	}

		

}
	
