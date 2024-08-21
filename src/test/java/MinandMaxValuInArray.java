import org.checkerframework.checker.units.qual.min;

public class MinandMaxValuInArray {
	
	
	public static  int[] findMinAndMaxArray(int[] arr) {
		
		int maxValue=arr[0];
		int minValue=arr[0];
		
		for(int n:arr) {
			if(n>maxValue) {
				maxValue=n;
			}else if (n<minValue) {
				minValue=n;
			}
		}
		
		
		return new int[] {minValue,maxValue};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        try {
            int[] result = findMinAndMaxArray(array);
            System.out.println("Maximum value: " + result[0]);
            System.out.println("Minimum value: " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

	}

}
