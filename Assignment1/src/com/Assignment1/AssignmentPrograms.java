package com.Assignment1;

public class AssignmentPrograms {
	int initialNum=15;
	
	//Program to Print INEURON
	public void printIneuronPattern() {
		
		//I Pattern
		for(int i=0;i<initialNum;i++) {
			for(int j=0;j<initialNum;j++) {
				if(i==0 || i==(initialNum-1) || j==initialNum/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//N
			for(int j=0;j<initialNum;j++) {
				if(j==0 || j==(initialNum-1) || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//E
			for(int j=0;j<initialNum;j++) {
				if(i==0 || i==(initialNum-1) || j==0 || i==initialNum/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//U
			for(int j=0;j<initialNum;j++) {
				if( (i==(initialNum-1) && (j>0 && j<(initialNum-1))) 
					|| (j==0 || j==initialNum-1) && i!=(initialNum-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//R
			for(int j=0;j<initialNum;j++) {
				if(j==0 || ((i==0 || i==initialNum/2) && j!=(initialNum-1)) 
					|| ((i>0 && i<initialNum/2 && j==initialNum-1))
					||(i>initialNum/2 && i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//O
			for(int j=0;j<initialNum;j++) {
				if(((i==0 || i==(initialNum-1))&&(j>0 && j<(initialNum-1)))
					|| ((j==0 || j==(initialNum-1)) && (i>0 && i<(initialNum-1))))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//N
			for(int j=0;j<initialNum;j++) {
				if(j==0 || j==initialNum-1 || i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			
			System.out.println();
			
		}
	}
	
	//Program to print number format
	public void programToPrintNumbers() {
		
		System.out.println();
		for(int i=1;i<=initialNum;i++) {
			for(int j=1;j<=initialNum;j++) {
			//checking number whether it is double digits or single digit to avoid uneven space issue
			if(initialNum>=10) {
				//if number is greater than or equal to 10, then till 9 add zero(0) as prefix 
				if(i<=9)
				 System.out.print("0"+i+" ");
				else
				 System.out.print(i+" ");
			}
			//if number is less than or equal to 9 not required to add zero(0) as prefix
			else
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	//Program to print AllPatterns
	public void allPatterns() {
		
		System.out.println();
		for(int i=0;i<initialNum;i++) {
			
			//Pattern 3
			for(int j=0;j<initialNum;j++) {
				if(i==0||i==(initialNum-1)||j==0||j==(initialNum-1)
						|| (i+j<=((initialNum-1)/2)) || (j-i>=((initialNum-1)/2)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//Pattern 4
			for(int j=0;j<initialNum;j++) {
				if((i-j>=((initialNum-2)/2)) || (j+i>=((initialNum-2)+(initialNum/2)))||(i==(initialNum-1))
						|| (i==(initialNum-2)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print(" ");
			
			//Pattern 5
			for(int j=0;j<initialNum;j++) {
				if(i==0 || j==0 || i==(initialNum-1) || (i+j<=((initialNum-1)/2)) 
					    || ((i-j>=((initialNum-1)/2))))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
	
		
}


