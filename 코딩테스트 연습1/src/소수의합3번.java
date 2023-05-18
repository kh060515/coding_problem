import java.util.Iterator;

public class 소수의합3번 {
	public static void main(String[] args) {
		int result=0;
		int num=30;
		result=solution(num);
	}

	private static int solution(int a) {
		int answer=0;
		int count=0;
		int j=0;
		for(int i=1; i<=a; i++) {
			count=0;
			j=1;
			while(j<=i) {
				if(i%j==0) {
					count++;
				}
				j++;
			}
			if(count==2) {
				j=j-1;
				answer+=j;
			}
		}
		System.out.println(answer);
		return answer;
	}
	/*
	 * private static int solution(int a) { int answer=0; int count=0; int j=0;
	 * for(int i=1; i<=a; i++) { count=0; for(j=1; j<=i; j++) { if(i%j==0) {
	 * count++; } } if(count==2) { j=j-1; answer+=j; } } return answer; }
	 */
}
