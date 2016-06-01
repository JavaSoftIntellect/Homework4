import java.util.Arrays;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int a[] = { 25, 18, 3, 12, 44 };
		Arrays.sort(a);

		System.out.println("The sorted array is:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print("\nNumber? ");
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();

		int c = Arrays.binarySearch(a, b);
		System.out.print("The number is found at position: " + c);

		in.close();
	}

}