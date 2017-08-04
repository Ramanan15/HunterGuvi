public class P100 {
	public static void userMethod(int n){
		String s = String.valueOf(n);
		int num = 0;
		int pow = 0;
		int sum = 0;
		for(int i = 0;i < s.length(); i++) {
			if(i != s.length() - 1) {
				num = Integer.parseInt(s.substring(i,i + 1));
				pow = Integer.parseInt(s.substring(i + 1,i + 2));
				sum += Math.pow(num,pow);
			}
			if(i == s.length() - 1) {
				num = Integer.parseInt(s.substring(i));
				sum += (int)Math.pow(num,0);
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		userMethod(122334);

	}

}