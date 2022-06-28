import java.util.Scanner;

public class CountNumberOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
Scanner s=new Scanner(System.in);
long num= s.nextInt();
long n= s.nextInt();
if(num<0 || n<0)
{
	System.out.println("Number too small");
}
else if(num>32767 || n>32767)
{
	System.out.println("Number too large");
}
else
{
while(num>0)
{
	count=(num%10== n) ? count+1:count;
	num=num/10;
}
System.out.println(count);
	}
	}
}
