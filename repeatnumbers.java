import java.util.*;
import java.lang.*;
import java.io.*;

class RepeatElement 
{
	void printRepeating(int arr[], int size) 
	{
		int i, j;
		System.out.println("Repeated Elements are :");
		for (i = 0; i < size; i++) 
		{
			for (j = i + 1; j < size; j++) 
			{
				if (arr[i] == arr[j]) 
					System.out.print(arr[i] + " ");
					 else
				  System.out.print("0");
				
			}
		
		}
		
				   
	}
			
