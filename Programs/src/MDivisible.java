
import java.util.*;
public class MDivisible 
{
    public static void main(String[] args) {
       int m;
       int n;
       Scanner s=new Scanner(System.in);
       m=s.nextInt();
       n=s.nextInt();
       int p=0;
       for(int i=1;i<=m;i++)
       {
           if(i%n==0)
           {
               p=p+i;
           }
       }
       System.out.println(p);
    }
}
