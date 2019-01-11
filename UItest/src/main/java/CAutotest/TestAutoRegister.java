package CAutotest;

import java.util.Random;

public class TestAutoRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	/*public String randomstr(){
		int randomNum;
		String base = "0123456789asdfghjkl"+"QWERTYUIOASDFGHJK";
		Random random = new Random();
		
		
		return null;
		
	}*/
	public class randomStr {
		public  String getRandomStr(int length){
			int randomNum;
			char randomChar;
			String base = "0123456789abcdefg"
					+ "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			Random random = new Random();
			StringBuffer str = new StringBuffer();
			for(int i = 0 ;i<=length;i++){
				randomNum = random.nextInt(base.length());
				randomChar = base.charAt(randomNum);
				str.append(randomChar);
			}
			return str.toString();
		}
	}

}
