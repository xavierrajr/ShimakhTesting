package practise;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num to get its table");
		int num = sc.nextInt();
		
		for(int i=1;i<=20;i++) {
			System.out.println(num+"*"+i+"="+(num*i) );
		}

	}

}
