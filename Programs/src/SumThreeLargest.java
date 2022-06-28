


import java.util.Scanner;

public class SumThreeLargest {

	public static void main(String[] args) {
		
		int n, i,j,k=0,temp=0, sum=0;
		//int flag=0;
                        Scanner in=new Scanner(System.in);
                        n = in.nextInt();
                        if(n < 0)
                        {
                                    System.out.print("Invalid array size");
                                    System.exit(0);
                        }
                        else
                        {
                                    int a[]=new int[20];
                                    for(i = 0; i< n; i++)
                                    {
                                                a[i] = in.nextInt();
                                                 if(a[i] < 0)
                                                {
                                                            //flag=1;
                                                            System.out.print("Invalid input");
                                                            System.exit(0);
                                                }
                                    }
                                   // if(flag!=1)
                                   // {
                                                for(i=0;i<n;i++)
				{
                                                            for(j=i+1;j<n;)
					{
                                                                        if(a[i]==a[j])
						{
                                                                                    for(k=j;k<n;k++)
                                                                                    a[k]=a[k+1];
                                                                                    n--;
                                                                        }
                                                                        else
                                                                                    j++;
                                                            }
                                                }
                                                for(i=0;i<n;i++)
				{
                                                            for(j=i+1;j<n;j++)
					{
                                                                        temp = a[i];
                                                                        a[i] = a[j];
                                                                        a[j] = temp;
                                                            }
                                                }
                                                sum=a[0]+a[1]+a[2];
                                                System.out.println(sum);
                                    //}
                        }

	}

}
