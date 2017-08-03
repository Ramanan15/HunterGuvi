import java.util.Scanner;
public class Hunt63 {
	public static void userMethod(int[] a){
		int t = 0;
		for(int i = 0;i <= a.length - 1; i++) {
			int max = a.length-1;
			for(int j = a.length - 2;j > i; j--) {
				if(max < a[j]){
					t = a[j];
					a[j] = a[i];
					max = t;
				}
			
				System.out.println(i+" "+j);
				
			}
			
		}
		a[a.length - 1] = 0;
		for(int n:a) {
			System.out.println(n+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		in.close();
		userMethod(arr);
	}
}
