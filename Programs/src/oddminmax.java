import java.util.Scanner;

public class oddminmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int size=0;
	int number[]=null;
	maximumSum(number,size);
	}
	public static int maximumSum(int number[],int size)
	{
		int sum=0,numbers=0,even=0,odd=0;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		if(size<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			numbers=sc.nextInt();
			if(numbers<0)
			{
				System.out.println("Invalid Input");
			}
			else if(numbers % 2==0)
			{
				even+=numbers;
				
			}
			else
			{
				odd+=numbers;
			}
		}
		if(even>odd)
		{
			System.out.println(even);
		}
		else
		{
			System.out.println(odd);
		}
		return sum;
		
	}
}
