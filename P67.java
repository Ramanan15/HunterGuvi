import java.util.ArrayList;
public class Hunt67 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ramanan#13#54#23");
		a1.add("sathish#14#45#61");
		String[] s1 = ((String)a1.get(0)).split("#");
		String[] s2 = ((String)a1.get(1)).split("#");
		int[] m1 = new int[s1.length];
		int[] m2 = new int[s2.length];
		for(int i = 1;i < s1.length; i++) {
			m1[i - 1] = Integer.parseInt(s1[i]);
		}
		for(int i = 1;i < s2.length; i++) {
			m2[i - 1] = Integer.parseInt(s2[i]);
		}
		int mark1 = 0;
		int mark2 = 0;
		for(int j = 0;j < m1.length; j++) {
			mark1 += m1[j];
		}
		for(int j = 0;j < m2.length;j++){
			mark2 += m2[j];
		}
		if(mark1 > mark2) {
			System.out.println(s1[0]);
		}else{
			System.out.println(s2[0]);
		}
		

	}

}
