import java.util.*;
public class Pro1 {
public static void main(String[] args) {
	String []str=new String[4];
	str[0]="hai My Name is bala";
	str[1]="hai My Name was Bala at once";
	str[2]="hai My Name Bala is good";
	str[3]="hai My Name bala is short";
	String res=str[0];
	String s2="";
		for(int j=1;j<str.length;j++) {
			String s1=str[j];
			s2=res;
			res="";
		  for(int k = 0,l = 0;k < s1.length() && l < s2.length(); k++, l++) {
			if(s1.charAt(k) == (s2.charAt(k))){
			   res ="" + res+s1.charAt(k);
			}
			else {
				break;
			}
			}		
			}
	System.out.println(res);
}
}
