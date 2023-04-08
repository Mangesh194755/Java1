package JavaBasics1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {

	public static void main(String[] args) {

		String[] stringArray = { "Hello", "there", "how", "are", "you", "Today" };

		// using Arrays.toString()
		System.out.println(Arrays.toString(stringArray));
		
		

		// using StringBuilder.append()
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < stringArray.length; i++) {
			stringBuilder.append(stringArray[i]);
			System.out.println(" " + stringArray[i]);

		}
		
		String str = String.join(" ", stringArray);
		System.out.println(str);
		
		String str1 = Arrays.stream(stringArray).collect(Collectors.joining());
		System.out.println(str1);
		
	}

}
