
public class MaxElementInArray {
	public static void main(String[] args) {
		
		
		int array[] = new int[] {45,22,84,9,47,98,54,67,91};
		
		int maxValue =  array[0];
		int arrayIndex = 0;
		for(int i = 1; i< array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
				arrayIndex = i;
			}
		}
		
		System.out.println("Max Value: " + maxValue);
		System.out.println("Index: " + arrayIndex);
	}

}
