package packAnd_Scan;

public class Reverese1 {
	
	public static void main(String[] args) {
		int a =153;
		int n=a;
		@SuppressWarnings("unused")
		int rev =0;
		int remainder;
		while(a>0) {        //100>0
			remainder = a%10;        //100%10
			rev = rev*10+remainder;
			 a = a/10;
			 a=n;
				
		}
		System.out.println(rev);
	
	}

}
