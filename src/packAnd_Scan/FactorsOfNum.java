
/*3) Design method to print factors of given number ( enter no.=6 the factors should be displayed like 1,2,3,6 */
package packAnd_Scan;
import java.util.Scanner;
public class FactorsOfNum
{

	public int getFactor(int number)
	{
		int z=6;
		int n=6;
		for(int i=1; i<=n; i++)                              //1,2,3,4
		{
			if(z%i == 0)                                          //
			{
				System.out.print(i + " ");
			}
		}
		return number;
	}
	//===============================================
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int z = sc.nextInt();
		
	    FactorsOfNum factor = new FactorsOfNum();
	    factor.getFactor(z);
	
	}
}

