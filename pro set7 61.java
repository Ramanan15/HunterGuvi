public class EncodThreeStr {
	public static String output1; 
	public static String output2;
	public static String output3;
	public static void main(String [] args) {
	encodeThreeStrings("TestCase4For", "StringProblem@with","Numbers123456");
	System.out.println(output1);
	System.out.println(output2);
	System.out.println(output3);
	}
	public static void encodeThreeStrings(String input1, String input2, String input3)
	{ 
		String[] name=new String[]{input1,input2,input3};
	    String[] front = new String[3];
	    String[] middle = new String[3];
	    String[] end = new String[3];
	    for(int i = 0;i < 3; i++) {	
	    int len = name[i].length();
			if(len%3==0) {
				front[i]=name[i].substring(0,len/3);
				middle[i]=name[i].substring(len/3, 2*(len/3));
				end[i]=name[i].substring(2*(len/3), len);
			}
			else if(len%3==1) {
				front[i]=name[i].substring(0, len/3);
				middle[i]=name[i].substring(len/3, (2*(len/3))+1);
				end[i]=name[i].substring((2*(len/3))+1, len);
			}
			else {
				front[i]=name[i].substring(0, (len/3)+1);
				middle[i]=name[i].substring((len/3)+1, (2*(len/3))+1);
				end[i]=name[i].substring((2*(len/3))+1, len);
			}
	
	    }
String frontName = front[0] + middle[1] + end[2];
String middName = middle[0] + end[1] + front[2];
String endName = end[0] + front[1] + middle[2];
char[] toggle = endName.toCharArray();
for(int i = 0;i < toggle.length; i++) {
	if(toggle[i] >= 65 && toggle[i] <= 90) {
		toggle[i] = (char) (toggle[i] + 32);
	}
	else if(toggle[i] >= 97 && toggle[i] <= 122){
		toggle[i] = (char) (toggle[i] - 32);
	}
}
endName = new String(toggle);
output1 = frontName; 
output2 = middName;
output3 = endName; 
} 
}