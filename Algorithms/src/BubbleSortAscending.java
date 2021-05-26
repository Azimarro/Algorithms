
public class BubbleSortAscending {
		
	public static void main(String[] args) {
		int array[] = new int[] {23,11,9,56,98,75,43,28,54,25,14,73,45};
		System.out.println("Array before bubble sort: " );
		printArray(array);
		boolean isSorted = false;
		
		while(!isSorted) {
		isSorted= true;	
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] < array[i-1]) {
				int temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
				isSorted = false;
				}
			}
		}
		System.out.println();
		System.out.println("Array after bubble sort");
		printArray(array);
	}
	
	private static void printArray(int array[]) {
		System.out.print("{");
		for(int i = 0; i< array.length; i++) {
			if(i>0) {
			System.out.print(", ");
		}
			System.out.print(array[i]);
			}
		System.out.print("}");
	}
}
