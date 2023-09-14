package samplepackage;

public class ArrayLength {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		arr[4]=7;
		System.out.println(" length of the array " +arr.length);
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
