import java.util.Scanner;

public class ConnectionType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int size,i,count = 0;
	        int countfourcontype = 0,counttwocontype = 0,countthreecontype = 0;

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
	            if(arr[i]<0)
        		{
        			System.out.println("Invalid connection");
        		}
	        }
	        

	        for( i=0;i<arr.length;i++)
	        {
	        	count=0;
	        	//while(arr[i]!=0)
	        	//{
	        		//arr[i]=arr[i]/10;
	        		//count=arr[i];
	        		count=arr[i]/1000;
	        	 if(count==2)
		        	{
		        		counttwocontype++;
		        	}
		        	else if(count==3)
		        	{
		        		countthreecontype++;
		        	}
		        	else if(count==4)
		        	{
		        		countfourcontype++;
		        	//}
	        	}
		      
	        }
	        System.out.println(counttwocontype);
	        System.out.println(countthreecontype);
	        System.out.println(countfourcontype);


	}
	}

}
