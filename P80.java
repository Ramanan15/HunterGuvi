import java.util.Scanner;
public class Hunt80 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int n = in.nextInt();
		System.out.println("Jumping Numbers smaller or equal to "+n+" : ");
		for(int i = 1;i <= n; i++){
			int flag = 0;
			String num = String.valueOf(i);
			if(num.length() <= 1){
				System.out.println(i+" ");
			}else{
				String[] ar = num.split("");
				int[] arr = new int[num.length()];
				for(int j = 0;j < ar.length; j++){
					arr[j]=Integer.parseInt(ar[j]);
				}
				//to check '0' in the number
				for(int h=0;h<arr.length;h++){
					if(arr[h]==0){
						flag=1;
					}
				}
				//to check the difference between the digits is one or not
				if(flag==0){
					for(int k=0;k<arr.length-1;k++){
							int m=Math.abs(arr[k]-arr[k+1]);
							if(m!=1){
								flag=1;
							}
					   }
				}
				if(flag!=1){
					System.out.println(i+" ");
				}
			}
		}in.close();
	}
}
