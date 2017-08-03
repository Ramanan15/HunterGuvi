import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Hunt65 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = in.nextInt();
		System.out.println("Enter the elements: ");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0;i < n; i++){
			a.add(in.nextInt());
		}
		System.out.println("Enter number to be delete: ");
		int r=in.nextInt();
		System.out.println("Before deletion: ");
		System.out.println(a);
		System.out.println("After deletion: ");
		Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {
            int x = (Integer)itr.next();
            if(x == r) {
            	 itr.remove();
            }
               
        }
		System.out.println(a);
		in.close();
	}
}
