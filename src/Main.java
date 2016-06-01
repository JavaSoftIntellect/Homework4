
public class Main {

	public static void main(String[] args) {
		int[] array = new int[] {-2,4,6,7,9,12};
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += array[i];
			}
			System.out.println("The sum of the odd numbers is:" + sum);
		}
	}

}
