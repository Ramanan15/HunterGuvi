import java.util.Scanner;
public class Hunt85 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;
		for(int i = 0; i < n; i++){
			int t = i;
			while(t != 0){
				if(t % 10 == 2){
					c++;
				}
			t /= 10;
			}
		}
		System.out.println(c);
		in.close();
	}

}
