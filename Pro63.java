import java.util.*;
public class Pro63 {
	public static void main(String[] args){
	  	String s="aaaabghpq";
	    		HashSet<Character> set = new HashSet<Character>();
	    		int max = 0;
	    		int i = 0;
	    		int start = 0;
	    			while(i < s.length()) {
	       				 char c = s.charAt(i);
	        				if(!set.contains(c)) {
	            					set.add(c);
	        				}
						else {
	           					max = Math.max(max,set.size());
	            						while(start < i && s.charAt(start) != c) {
	                						set.remove(s.charAt(start));
	                						start++;
	            						}
	            						start++;
	        				}
	        				i++;
	    			}	 
	    		max = Math.max(max,set.size());	 
	    		System.out.println(max);
	}
}
