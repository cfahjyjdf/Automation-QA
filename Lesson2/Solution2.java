public class Solution2 {
	public static void main(String[] args) {
		String string="Рассерженный Родион Романович раскричался \"Рано радовались, размокший ремень рюкзака разорвался\"";
		String string2="";
		char[] strToArray = string.toCharArray();
		for(int i = 0; i < strToArray.length; i++) {
			String b = Character.toString( strToArray[i] );
			//if (b.equals("р") || b.equals("Р")) {
			if (b.equals("р")) {
				b = "*";
			}
			string2=string2+b;
		}
		System.out.printf( "%s\n", string2 );
	}
}
