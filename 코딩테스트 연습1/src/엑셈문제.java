import java.util.Arrays;

public class 엑셈문제 {
	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4},{5,6}};
		test(arr);
	}

	private static void test(int[][] arr) {
		int arrsize=arr.length;
		int[][] arr2=new int[arrsize][arrsize];
		for(int i=0; i<arrsize-2; i++) {
			for(int j=0; j<arrsize-1; j++) {
				arr2[i][j]=arr[i][j];
			}
		}
	System.out.println(Arrays.deepToString(arr2));
	}
}
