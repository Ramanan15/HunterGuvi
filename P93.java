import java.util.Scanner;
public class Hunt93 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] ar = s.split(" ");
		String out = "";
		for(int i = 0;i < ar.length; i++) {
			StringBuffer str = new StringBuffer(ar[i].toLowerCase());
			String result = String.valueOf(str.reverse());
			String rev = "";
			for(int j = 0;j < ar[i].length(); j++) {
				char t = result.charAt(j);
				if(Character.isUpperCase(ar[i].charAt(j))) {
					rev += Character.toUpperCase(t);
				}
				else {
					rev += t;
				}
			}
			out+=rev+" ";
		}
		System.out.println(out);
		in.close();
	}
}
