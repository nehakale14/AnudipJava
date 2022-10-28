package question1;

public class ArrayDemo {
	
	public static int[] manipulateIntegerArray(int[] array) {
		
		int[] newArray = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			
			newArray[i] = array[i]+5;
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		
		int[] x = new int[] {1};
		int[] y = manipulateIntegerArray(x);
		
		for(int i=0; i<y.length; i++) {
			System.out.println(""+y[i]);
		}
	}

}