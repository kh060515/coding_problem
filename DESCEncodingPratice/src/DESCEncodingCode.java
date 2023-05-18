import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
//https://yoo-hyeok.tistory.com/107
public class DESCEncodingCode {
	//DES암호화 알고리즘 공부
	public static void main(String[] args) {
		String text="실험용Password";
		
		
	}
	
	//고정키 정보
	public static String key() {
		return "yoo_jong_hyeok_passwdKey";
	}
	
	//키값 24바이트인 경우 TripleDES 아니라면 DES
	public static Key getKey() throws Exception{
		System.out.println("키의 길이:"+key().length());
		return (key().length()==24) ? getKey2(key()) : getKey1(key());
	}
	
	//지정된 비밀키를 가지고 오는 메소드(DES)
	// require Key Size: 16bytes
	//return Key 비밀키 클래스 
	public static Key getKey1(String keyValue) throws Exception{
		System.out.println("DES 암호화");
		DESKeySpec desKeySpec=new DESKeySpec(keyValue.getBytes());
		SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DES");
		Key key=keyFactory.generateSecret(desKeySpec);
		return key;
	}
	
	//지정된 비밀키를 가지고 오는 메소드(TripleDES)
	//require Key Size: 24bytes
	public static Key getKey2(String keyValue) throws Exception{
		System.out.println("TripleDES 암호화");
		DESedeKeySpec desKeySpec=new DESedeKeySpec(keyValue.getBytes());
		SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DESede");
		Key key=keyFactory.generateSecret(desKeySpec);
		return key;
	}
	
	//문자열 대칭 암호화
}
