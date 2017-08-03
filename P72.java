import java.util.Scanner;
public class Hunt72 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] ar = s.split(" ");
		String rev = "";
		for(int i = 0;i < ar.length; i++){
			if(i == 0||i % 2 == 0){
				for(int j = ar[i].length() - 1;j >= 0; j--){
					rev += ar[i].charAt(j);
				}
				String temp = rev;
				rev = ar[i];
				ar[i] = temp;
			}
			rev = "";
		}
		for(String n:ar){
			System.out.print(n+" ");
		}in.close();
	}
}