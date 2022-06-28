import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		int shiftall=sc.nextInt();
		
		if(sal>8000)
		{
			System.out.println("Salary too large");
		}
		else if(shiftall<0)
		{
			System.out.println("Shift too small");
		
		}
		else if(sal<0)
		{
			System.out.println("Salary too small");
		}
		else
		{
			
			int foodsal=(sal*20/100); // 1400
			int travelsal=(sal*30/100); //2100
			int shiftsone=(sal*2/100);//140
			int shifts=shiftsone*shiftall;//5*140=700
			int saving=foodsal+travelsal+shifts;//4200
			System.out.println(saving);
		}
	}

}
