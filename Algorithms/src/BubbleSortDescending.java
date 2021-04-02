
public class BubbleSortDescending {
	
	public static void main(String[] args) {
		int array[] = new int[] {15, 44, 10, 98, 65, 58, 73, 81, 35, 25, 89, 67, 99};
		System.out.println("Print Array Before Bubble Sort: ");
		
		printArray(array);
		
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			for(int i = 1; i<array.length; i++) {
				if(array[i] > array[i-1]) {
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					isSorted = false;
				}
			}
			
		}
		System.out.println();
		System.out.println("Print Array After Bubble Sort: ");
		printArray(array);
		
		
	}
	
	public static void printArray(int array[]) {
		System.out.print("{");
		
		for(int i = 0; i<array.length; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.print("}");
	}

}
