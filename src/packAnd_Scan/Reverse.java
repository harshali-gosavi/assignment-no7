/* 3)design method public int getReverseNumber(int num) which return int value to that method and result print into main method(enter the no = 125 then output will be 521 */

package packAnd_Scan;                                                       //package name
import java.util.Scanner;                                                  //import Scanner class from java.util package
public class Reverse {
	public int getReverseNumber(int reve) {                                 // declare getReverseNumber method with parameter reve
		
		System.out.println("Reverse of this number:" + reve);
	  
		return reve;                                                        //method return int type of value
	}
	public static void main(String[] args)                           //-----------------------main method-----------------------------------
	{  
		
		@SuppressWarnings("resource")                   
		Scanner obj = new Scanner(System.in);                      //to get input from user we create a object of Scanner class and import it from java.util package
		System.out.println("Enter the no: ");                           //in simple print the no. statement
		int a = obj.nextInt();                                    // now, next we declare 'a' variable for storing user input. using object name of class.appropriate method
		
		
	    int reve=0;                                              //we want to reverse the input so, we take two variables and initialize reve variable to 0 .
        int remainder;
        while(a>0)                                              // 125>0 (true)                     12>0 (true)---|     1>0 (t) now again check remainder, reverse, and this time value of a is 0 so loop not go inside
        {                                                      //   |                                  |                |
		   remainder = a%10;                                  //     remainder=5('%' remainder return) |   remainder=2  |                                     
		   reve = reve*10 + remainder;                       //      reve=5                            |   reve=2       |
		   a = a/10;                                        //     a= 12('/'quotient return)           |   a=1          |
	    }                                                   //      |----------------------------------|    |-----------
       
         Reverse obj1 = new Reverse();                         //now, we want to create of object of Reverse class for calling the method getReverseNumber().....and object name is  obj1
         obj1.getReverseNumber(reve);                         // we declare getReverseNumber() outside the main method so this is non static method and if we use variable in this method that variable called as instance (global) variables.In  non- static method  there are only one way to call method & i.e object declaration way........object name.method name(parameter)
                                                             //-----------------obj1 call getReverseNumber which is inside in Reverse class....................
		
	}
	
    
}
