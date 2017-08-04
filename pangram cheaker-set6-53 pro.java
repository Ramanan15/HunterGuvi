public class PangramCheaker {
    public static boolean isPangram(String test) {
        for (char a = 'A'; a <= 'Z'; a++) {
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0)) {
                return false;
	     }
	}
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPangram("the quick brown fox jumps over the lazy dog"));
        System.out.println(isPangram("the quick brown fox jumped over the lazy dog"));
        System.out.println(isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(isPangram("ABCDEFGHIJKLMNOPQSTUVWXYZ"));
        System.out.println(isPangram("ABCDEFGHIJKL.NOPQRSTUVWXYZ"));
        System.out.println(isPangram("ABC.D.E.FGHI*J/KL-M+NO*PQ R\nSTUVWXYZ"));
        System.out.println(isPangram(""));
    }
}