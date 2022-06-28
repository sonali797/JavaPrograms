import java.util.Scanner;
public class Coins {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		if(n<0)
		{
			System.out.println("Invalid input..");
		}
		else 
		{
			//amount
			int notes=n;
while(notes!=0)
{
		if(notes>=500)
		{
			notes=notes-500;
			count++;	
//			count=notes/500;
//			notes=notes-count*500;
//		
		}
		else if(notes>=100)
		{
			notes=notes-100;
			count++;
			
//			count=notes/100;
//			notes=notes-count*100;
		}
		else if(notes>=50)
		{
			notes=notes-50;
			count++;
//			count=notes/50;
//			notes=notes-count*50;
		}
		else if(notes>=10)
		{
			notes=notes-10;
			count++;
//			count=notes/10;
//			notes=notes-count*10;
		}
		else if(notes>=5 )
		{
			notes=notes-5;
			count++;
			
//			count=notes/5;
//			notes=notes-count*5;
		}
		else if(notes>=1)
		{
			notes=notes-1;
			count++;

		}
//		else
//		{
//		
//	count+=notes;
//		}
}
		System.out.println(count);
		
		}
	}

}
