import java.util.Arrays;
public class Solution4 {
	public static void main(String[] args) {
		String srcStr="Я у мамы программист";
		       srcStr=srcStr.replaceAll("[^A-Za-zА-Яа-я]", "");
		char[] strToArray = srcStr.toCharArray();
		int charCount=0;

		for(int i = 0; i < strToArray.length; i++) {
			charCount=charCount+1;
		}

		char[] cleanArray = new char[charCount];

		for(int i = 0; i < charCount; i++) {
   			char c = Character.toLowerCase(strToArray[i]);
			cleanArray[i] = c;
		}

		Arrays.sort(cleanArray);
		System.out.println(Arrays.toString(cleanArray));
	}
}
