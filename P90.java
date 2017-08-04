import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Hunt90 {
	public static String output;
	public static void sortString(String s) {
		output = "";
		TreeSet<Character> tr = new TreeSet<Character>();
		for(int i = 0;i < s.length();i++) {
			tr.add(s.charAt(i));
		}
		Iterator i=tr.iterator();
		while(i.hasNext()) {
			output += i.next();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		sortString(s);
		System.out.println(output); 
	}
}
