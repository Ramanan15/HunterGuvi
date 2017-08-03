import java.util.Scanner;
public class Hunt64 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Amount : Rs.");
		int rs = in.nextInt();
		int a = rs;
		int rem = 0;
		int notes = 0;
		int count = 0;
		int[] cash = {500,100,50,10,1};
		for(int i = 0;i < cash.length; i++){
			if(a >= cash[i]){
				rem = a % cash[i];
				notes=a / cash[i];
			}
			count += notes;
			notes = 0;
			a = rem;
		}
		System.out.println("The count of notes :"+count);
		in.close();
	}
}
