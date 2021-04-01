
public class MinElementInArray {
		public static void main(String [] args) {
			
			int[] array = new int[] {25, 44, 11, 98, 32, 78, 45, 75, 55, 9, 23, 56};
			
			int minValue = array[0];
			
			for(int i = 1; i < array.length; i++) {
				if(array[i] < minValue) {
					minValue = array[i];
				}
			}
			
			System.out.println("Min Value: " + minValue);
			
		}
}
