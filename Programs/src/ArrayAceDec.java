import java.util.Arrays;
import java.util.Scanner;

public class ArrayAceDec {

	static void printOrder(int[] arr, int n)
	{
	Arrays.sort(arr); 
	 for(int i = 0; i < n / 2; i++) 
	{

	        System.out.print(arr[i]+" "); 
	}
	for(int j = n - 1; j >= n / 2; j--) 
	{
	    System.out.print(arr[j]+" "); 
	}

	}
	public static void main(String[] args) 

	{
int i;
		 Scanner sc=new Scanner(System.in);
	        int size = sc.nextInt();
	        int arr[]=new int[size];
	        for(i=0;i<size;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	    int n = arr.length; 
	    if(size < 0)
        {
                    System.out.print("Invalid array size");
                    System.exit(0);
        }
        else
        {
	    printOrder(arr, n);
        }
	}

	}

