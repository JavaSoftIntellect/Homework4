import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		int [] array = new int [] {1,2,3,4,5,6,7,8,9,10};
		for(int i =0; i<array.length;i++){
		array[i]=array[i]*10;
		}System.out.print(Arrays.toString(array));

	}

}
