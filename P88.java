import java.util.Scanner;
public class Hunt88 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String s1 = "";
		for(int i = s.length() - 1;i >= 0;i--) {
			s1 += s.charAt(i);
			s = s.replace(s.charAt(i),' ');
		}
		s1 = s1.replace(" ", "");
        System.out.println(s1);
        in.close();
	}
}