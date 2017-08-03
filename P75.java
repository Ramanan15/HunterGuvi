import java.util.Scanner;
public class Hunt75 {
	public static void userMethod(int[] a){
		for(int i = 0;i < a.length; i++) {
			if(i == a.length - 1){
				System.out.print("-1");
			}else if(a[i] > a[i+1]) {
				System.out.print(a[i + 1]+" ");
			}else {
				System.out.print("-1 ");
			}			
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < arr.length; i++){
			arr[i] = in.nextInt();
		}
		userMethod(arr);
		in.close();
	}

}
