public class Hunt98 {
	public static int output;
	public static void userMethod(int input1,int input2,int input3) {
		int count = 0;
		for(int i = input2; i <= input3; i++){
			if(i > 10 && i < 1000) {
				int c = 0;

				for(int j = i;j >= 1;j--) {
					if(i % j == 0) {
					    c++;
					}
				}		
				if(c == 2) {
				  while(i != 0){
					  int num = i % 10;
					  if(num == input1){
						  count++;
					  }
				}
		
		     }
		}
		}
		System.out.println("ghhgkhfgkh");
		System.out.println(count);
		if(count >= 1) {
			output=count;
			System.out.println(output);
		}
		else {
			System.out.println(input1+" is not in the list of prime numbers");
		}
	}

	public static void main(String[] args) {
		userMethod(1,11,12);

	}

}
