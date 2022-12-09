
//1. Design method to check whether the character is alphabet, digit and special symbol.
package packAnd_Scan;
import java.util.Scanner;

public class Character {
	
	char str;
	public char getCharacter(char str)                                               //design a method getCharacter. str is variable
	{ 
		
		
	     if((str>='a' && str<='z') || (str>='A' && str<='Z'))
          {
   	          System.out.println("Enter character is  alphabet");
          }
       else if((str>='0') && (str<='9'))
         {
   	          System.out.println("Enter character is digit");
         }
       else
         {
   	          System.out.println("Enter character is special symbol");
         }
    
          return str;
	}
	
	public static void main(String[] args)
	{
	     
		 @SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);                          //get input from user so using create a object of Scanner class
		 System.out.println("Enter character:");                       // enter input
		char str = obj.next().charAt(0);                               //user input is stored in str variable and use this method 
	     
	     Character obj1 = new Character();                           //to call getCharacter method we create object of class 
	     obj1.getCharacter(str);                                     //to call by object creation objectname.methodname(user input store that variable)
	    
     }
	

}             

/* we can declare global variable but, we cannot declare local variable which is inside the method.
 * we only initializa local variable, declaration is not  allowed in local variable */
