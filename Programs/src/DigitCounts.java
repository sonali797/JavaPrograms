import java.util.Scanner;

public class DigitCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int n=0,size,i,count=0,rcount=0;
	        int countone = 0,counttwo = 0,countthree = 0;

	        Scanner sc=new Scanner(System.in);
	        size=sc.nextInt();
	        int arr[]=new int[size];
	        
	        
	        if(size < 0)
            {
                        System.out.print("Invalid array size");
                        System.exit(0);
            }
            else
            {
	        for(i=0;i<size;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        

	        for( i=0;i<arr.length;i++)
	        {
	        	count=0;
	        	while(arr[i]!=0)
	        	{
	        		arr[i]=arr[i]/10;
	        		count++;

	        	}
		        if(count==1)
		        {
		        	countone++;
		        }
		        else if(count==2)
		        {
		        	counttwo++;
		        }
		        else if(count==3)
		        {
		        	countthree++;
		        }
	        }
	        System.out.println("1");
	        System.out.println(countone);
	        System.out.println("2");
	        System.out.println(counttwo);
	        System.out.println("3");
	        System.out.println(countthree);

            }
	}

}
