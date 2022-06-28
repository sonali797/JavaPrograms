import java.util.Scanner;

public class ConsecutiveElementfourmorethanfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,diff=0;
Scanner s=new Scanner(System.in);
int size = s.nextInt();
int arr[]=new int[size];
for(i=0;i<(arr.length);i++)
{
	arr[i]=s.nextInt();
}
for(i=0;i<(arr.length-1);i++)
{
int t=(arr[i]-arr[i+1]);
if(Math.abs(t)>=4)
{
	diff=1;
}
else
{
	diff=0;
}
i++;
}
System.out.println(diff);
	}

}
