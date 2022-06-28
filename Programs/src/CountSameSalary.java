import java.util.Scanner;

public class CountSameSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[20];
		int i;
		int count=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
if(n<0 ||arr[i]<0 )
{
	System.out.println("invalid");
i--;
}
else
{
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(arr[i]==arr[j+1])
			{
						count++;
				//int peoplecount=count+1;
			}
		}
		}
			System.out.println(count);

}	

	}

}
