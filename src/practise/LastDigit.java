package practise;

import java.util.Scanner;

public class LastDigit {
	
	public int last(int num) {
		int rem=num%10;
		return rem;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LastDigit p = new LastDigit();
		int abc=p.last(5467);
		System.out.println(abc);
		

		
		
	}

}
