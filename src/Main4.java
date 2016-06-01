public class Main4 {
	public static void main(String[] args) {
		int [][]array = new int[6][5];
		for (int j = 0, c = 30; j < 5; j++) {
			for (int i = 0; i < 6; i++, c--) {
				array[i][j] = c;
			}
		}
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}