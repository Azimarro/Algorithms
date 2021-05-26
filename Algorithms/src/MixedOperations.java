
public class MixedOperations {
	
		public static void main(String[] args) {
			
			int[] array = new int[]{45, 23, 98, 65, 33, 12, 57, 39, 18, 59, 99, 48, 71, 27};
			System.out.println("Display array: ");
			displayArray(array);
			System.out.println();
			findMaxElementInArray(array);
			findMinElementInArray(array);
			arrayReverse(array);
			bubbleSortAscending(array);
			bubbleSortDescending(array);
			
		}
		
		public static void bubbleSortDescending(int[] array) {
			boolean action = false;
			
			while(!action) {
				action = true;
				
			for(int i = 1; i< array.length; i++) {
				if(array[i] > array[i-1]) {
					int temp = array[i];
					array[i] = array[i-1];
					array[i-1] = temp;
					action = false;
				}
			}
			}
			
			System.out.println();
			System.out.println("Bubble Sort Descending");
			displayArray(array);
		}
		
		public static void bubbleSortAscending(int[] array) {
			
			boolean action= false;
			
			while(!action) {
				action = true;
				for(int i = 1; i < array.length; i++) {
					if(array[i] < array[i-1]) {
						int temp = array[i];
						array[i] = array[i-1];
						array[i-1] = temp;
						action = false;
					}
				}
			}
			System.out.println();
			System.out.println("Bubble Sort Ascending");
			displayArray(array);
		}
		
		public static void displayArray(int[] array) {
			System.out.print("{");
			for(int i = 0; i < array.length; i++ ) {
				if(i>0) {
				System.out.print(", ");			
			}
				System.out.print(array[i]);
			
		}
			System.out.print("}");
			
	}
		public static void findMaxElementInArray(int[] array) {
			int maxElem = array[0];
			
			for(int i = 1; i<array.length; i++) {
				if(maxElem < array[i]) {
					maxElem = array[i] ;
					
				}
				
			}
			System.out.println("Display max. element in array");
			System.out.println(maxElem);
		}
		
		public static void findMinElementInArray(int[] array) {
			int minElem = array[0];
			for(int i = 1; i < array.length; i++) {
				if(minElem > array[i]) {
					minElem = array[i];
				}
			}
			System.out.println("Display max. element in array");
			System.out.println(minElem);
		}
		
		public static void arrayReverse(int[] array) {
			System.out.println("Reverse Array");	
			for(int i = array.length -1; i >=0; i--) {
				System.out.print(array[i] + " ");
				
			}
		}
		
}
