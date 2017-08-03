import java.util.Scanner;
public class Font {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int count = 0;
		char t = 0;
		String result = "";
		for(int i = 0;i < s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i))) {
				t = s.charAt(i);
				s = s.substring(i+1);
			}
			for(int j = 0;j < s.length();j++) {
				count = 0;
				if(Character.isDigit(s.charAt(i))){
					count++;
				}
				else {
					break;
				}
			}
			for(int k = 0;k < count; k++) {
				result += t;
			} 
		}
		System.out.println(result);

	}

}
