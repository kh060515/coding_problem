/*
{ answer : 정답 번호 (1~5), score : number }로 이루어진 배열 arr이 정답지로 넘어갈 때,
가장 점수가 높은 수포자의 이름과 점수를 “이름 : 점수” 형태로 리턴해 주세요
시험 응시자는 1번으로 모두 찍은 a, 3번으로 모두 찍은 b, 5번으로 모두 찍은 c가 있습니다.
 [입출력 예]
[ { answer : 1, score : 5 }, { answer : 3, score : 3 }, { answer : 2, score : 4 } ] → a : 5
[ { answer : 1, score : 5 }, { answer : 5, score : 5 }, { answer : 2, score : 4 } ] → a : 5, c : 5
  */
public class 찍신찾기1번 {
	public static void main(String[] args) {
		int[][] key= {{1,5},{5,5},{2,4}};
		int[][] key2= {{1,5},{3,3},{2,4}};
		String result=highScore(key);
		System.out.println(result);
	}
	private static String highScore(int[][] arr) {
		int a=0;
		int b=0;
		int c=0;
		String result="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0]==1) {
				a+=arr[i][1];
			}else if(arr[i][0]==3) {
				b+=arr[i][1];
			}else if(arr[i][0]==5) {
				c+=arr[i][1];
			}
		}
		if(a==b || a==c || b==c) {
			if(a==b) {
				result="a:"+String.valueOf(a)+",b:"+String.valueOf(b);
			}else if(a==c) {
				result="a:"+String.valueOf(a)+",c:"+String.valueOf(c);
			}else if(b==c) {
				result="b:"+String.valueOf(b)+",c:"+String.valueOf(c);
			}else {
				result="a:"+String.valueOf(a)+",b:"+String.valueOf(b)+",c:"+String.valueOf(c);
			}			
		}else if(a>b && a>c) {
			result="a:"+String.valueOf(a);
		}else if(b>c) {
			result="b:"+String.valueOf(b);
		}else {
			result="c:"+String.valueOf(c);
		}
		return result;
	}
}
