package cs187.part1;

public class Arrays {
	public static void main(String[] args) {
		// Array of primitive types:
		int[] arrayOfInt = new int[5];
		
		// Array initialization:
		for (int i = 0; i < arrayOfInt.length; i++) {
			arrayOfInt[i] = i;
		}
				
		// Static array initialization:
		int[] arrayOfInt2 = {
			0, 1, 2, 3, 4, 5, 6	
		};
		
		// Array of objects:
		String[] arrayOfString = {
			"A", "B", "C", "D", "E"	
		};
	}
}
