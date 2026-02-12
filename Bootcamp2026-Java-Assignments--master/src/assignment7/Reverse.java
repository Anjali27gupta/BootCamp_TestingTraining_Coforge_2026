package assignment7;
// WAP in java to reverse a string and a number
public class Reverse {

	public static void main(String[] args) {
		String var= "Hello World";
		int num= 9876;
		int original_num=num;
		
		String rev="";
		for( int i =var.length() - 1; i>=0;i--) {
			rev+=var.charAt(i);
		}
		System.out.println("Original String : "+var);
		System.out.println("Reversed String : "+rev);
		
		int rev_num=0;
		while(num!=0) {
			int digit= num%10;
			rev_num= rev_num*10 + digit;
			num= num/10;
		}
		System.out.println("Original Number : "+original_num);
		System.out.println("Reversed Number : "+rev_num);
		
	}

}
