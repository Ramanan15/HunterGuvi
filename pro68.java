public class HuntPro68 {
	public static void userMethod(String Fname,String Lname,String PIN,int N) {
		String Sn = "";
		String Ln = "";
		if(Fname.length() > Lname.length()) {
			Sn=Lname;
			Ln=Fname;
		}
		else if(Fname.length()==Lname.length()) {
			String a = Fname.toUpperCase();
			String b = Lname.toUpperCase();
			if(a.charAt(0) > b.charAt(0)) {
				Sn = Lname;
				Ln = Fname;
			}
			else {
				Sn = Fname;
				Ln = Lname;
			}
		}
		else {
			Sn = Fname;
			Ln = Lname;
		}
		String user_id=Ln.charAt(0)+Sn+PIN.charAt(N-1)+PIN.charAt(PIN.length()-N);
		System.out.println("User-id = "+user_id);
	}
	public static void main(String[] args) {
		userMethod("Rajiv","Roy","560037",6);
	}

}