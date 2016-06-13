import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			a[i] = i + 1;
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}in.close();
	}
}
