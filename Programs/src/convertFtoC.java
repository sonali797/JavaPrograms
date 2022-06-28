import java.util.Scanner;

public class convertFtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fahrenheit=0;
convertToCentigrade(fahrenheit);
	}
	public static float convertToCentigrade(int fahrenheit)
	{
		Scanner s=new Scanner(System.in);
		fahrenheit= s.nextInt();
		if(fahrenheit<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		float centigrade;
		float f=fahrenheit;
		centigrade=((f-32)/9)*5;
		System.out.println(centigrade);
		return centigrade;
	}
}
