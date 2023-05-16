import java.util.Arrays;

public class 최소_공배수의_합2번 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int result=0;
		result=solution(arr);
	}

	private static int solution(int[] arr) {
		int check=0;
		int num1=0;
		int num2=0;
		int result=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				check=0;
				num1=arr[i];
				num2=arr[j];
				while(check==0) {
					if (num1>num2) {
						num2+=arr[j];
					}else if(num1<num2) {
						num1+=arr[i];
					}else {
						result+=num1;
						check=1;
					}							
				}	
				
			}			
		}
		System.out.println(result);
		return result;
	}
}
