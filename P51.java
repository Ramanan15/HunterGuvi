import java.util.Scanner;
public class Hunt51 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			String num1 = in.next();
			String num2 = in.next();
			String result = String.valueOf((Integer.parseInt(num1)*(Integer.parseInt(num2))));
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("Input should be number");
			System.out.println("Please enter the numbers only");
		}
		in.close();
	}
}
