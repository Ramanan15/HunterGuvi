public class HuntTest2{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String ip = in.next();
		System.out.println("Enter the length");
		int a = in.nextInt();
		String s4 = ip.substring(0,1);
		for(int i = a - 1;i < ip.length();i++){
			System.out.println(s4+ip.substring(i,i + 1));
		}
	}

}
