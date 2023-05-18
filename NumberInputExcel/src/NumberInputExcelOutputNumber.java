//입력받은 숫자에 따라서 액셀 행의 번호를 나타내주는 프로그램 ex)1을 넣으면 A가 출력, 26을 넣으면 Z가 출력, 27을 넣으면 AA, 28이면 AB, 52이면 AZ, 53이면 BA
//개발중, 2자리까지 맣게 알파벳 출력이 안됨, 알고리즘을 변경해야 할 가능성 농후, StringBuilder에 들어있는 모든 값이 Z일때 자릿수가 하나 추가되면서 모든 자리의 값들을 A로 변경되게 한 후에 연산하게끔 변경
public class NumberInputExcelOutputNumber {

	public static void main(String[] args) {
		NumberInputExcelOutputNumber number=new NumberInputExcelOutputNumber();
		System.out.println(number.InputNumber(702));		
	}
	
	public StringBuilder InputNumber(int number) {
		StringBuilder Alpabet=new StringBuilder();
		char sAlpabet = 0;
		int count=1;
		String str="";
		
		while(number>0) {	
			if(number>26) {				
				sAlpabet=(char)(count+64);
				Alpabet.append(sAlpabet);
								
				count++;
				number=number-26;
				
				if(number>26) {
					Alpabet.deleteCharAt(0);
				}
			}	
			
			if(number-26<=0) {
				sAlpabet=(char) (number+64);
				Alpabet.append(sAlpabet);
				number=number-26;
			}
		}		
		return Alpabet;
	}
}
