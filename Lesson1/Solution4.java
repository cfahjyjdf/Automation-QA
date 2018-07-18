public class Solution4 {
	public static void main(String[] args) {
		int n = 128;
		String s = String.format("%s", n);
		char[] strToArray = s.toCharArray();
		int sum=0;
		for(int i = 0; i < strToArray.length; i++) {
			char b = strToArray[i];
			int bi = Character.getNumericValue(b);
			    sum = sum + bi;
		}
		System.out.printf( "%d\n", sum );
	}
}
