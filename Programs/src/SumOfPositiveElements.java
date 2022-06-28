
import java.util.Scanner;

public class SumOfPositiveElements {

	public static void main(String[] args) {
		
		int n, i,sum=0;
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        if(n < 0)
        {
                    System.out.print("Invalid input");
                    System.exit(0);
        }
        else
        {
                    int a[]=new int[n];
                    for(i = 0; i< n; i++)
                    {
                                a[i] = in.nextInt();
                                if(a [i]>0)
                                sum=sum+a [i];
                    }
                    System.out.print(sum);
        }

	}

}
