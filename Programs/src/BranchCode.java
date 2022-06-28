import java.util.Scanner;

public class BranchCode {
	
	public static void main(String[] args)
    {
                int n, i ,bcode=0,count=0,temp=0;
// int flag=0;
                Scanner in=new Scanner(System.in);
                n = in.nextInt();
                if(n < 0)
                {
                            System.out.print("Invalid array size");
                            System.exit(0);
                }
                else
                {
                            int a[]=new int[n];
                            for(i = 0; i< n; i++)
                            {
                                        a[i] = in.nextInt();
                                         if(a[i] < 0)
                                        {
                                                    //flag=1;
                                                    System.out.print("Invalid account number");
                                                    System.exit(0);
                                        }
                            }
                           //if(flag!=1)
                            //{
                                        int code=in.nextInt();
                                        if(code<0)
                                        {
                                                    System.out.print("Invalid branch code");
                                                    System.exit(0);
                                        }
                                        for(i=0;i<n;i++)
		{
                                                    temp=a [i];
                                                    bcode=temp/100;
                                                    if(bcode==code)
                                                    count++;
                                        }
		System.out.println(count);
	//}
                }
    }


}
