public class Solution3 {
	public static void main(String[] args) {
		int min = 5, max = 155, fmin = 25, fmax = 100;
		int randnum = min + (int)(Math.random() * ((max - min) + 1));
		if ( randnum >= fmin && randnum <= fmax ) {
			System.out.printf( "Число %d содержится в интервале (%d,%d)\n", randnum, fmin, fmax );
		} else {
			System.out.printf( "Число %d не содержится в интервале (%d,%d)\n", randnum, fmin, fmax );
		}
	}
}
