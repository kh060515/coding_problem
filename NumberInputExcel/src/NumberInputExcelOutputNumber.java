//입력받은 숫자에 따라서 액셀 행의 번호를 나타내주는 프로그램 ex)1을 넣으면 A가 출력, 26을 넣으면 Z가 출력, 27을 넣으면 AA, 28이면 AB, 52이면 AZ, 53이면 BA
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
