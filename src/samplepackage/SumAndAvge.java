package samplepackage;

public class SumAndAvge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,54,6,7,9};
		int evensum=0;
		int oddsum=0;
		int evencount=0;
		int oddcount=0;
				int evenavg=0;
				for(int i:arr) {
					if(i%2==0) {
						evensum=i+evensum;
						evencount++;
					}
					else {
						oddsum=i+oddsum;
						oddcount++;
					}
				}

				System.out.println("sum of even numbers is " +evensum);
				System.out.println("sum of odd numbers is "+ oddsum);
				System.out.println("Average of even numbers is " + evensum/evencount);
				System.out.println("Average of odd number is "+oddsum/oddcount);
				
	}

}
