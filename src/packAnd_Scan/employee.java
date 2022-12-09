
/* 2) Design method  public int getNumberCube(int num) , return int value to that method and result should be into main method*/


package packAnd_Scan;                                  //package  packagename;
import java.util.Scanner;                          //we import Scanner class from java.util package

public class employee {                            //class name employee;
	
	public int getNumberCube(int num) {           //design a method  getNumberCube(int num)
		int a = num*num*num;
		System.out.println("cube of no is: " + num);
		return a;
		}
	

	public static void main(String[] args) {
		
		@SuppressWarnings({ "resource" })
		Scanner obj = new Scanner(System.in);                       //object declaration of scanner class , firstly we need to import Scanner class ....line2
		
		System.out.println("Enter the number: ");                   //we take input from user using scanner class
		int a = obj.nextInt();                                       //get input from and it stored in a variable. 
		
		
		employee emplo = new employee();                        //create object of employee class to call the getnumbercube() method
	    emplo.getNumberCube(a);
		
		
   }
}
