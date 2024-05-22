import java.util.Arrays;
import java.util.Optional;

public class OrderReverse {

	public static void main(String[] args) {
		String originalString = "My Name is Ashutosh";
		String reverseOrderString = reverseOrder(originalString);
		System.out.println("Original String : " + originalString);
		System.out.println("Reverse Order String : " + reverseOrderString);
		System.out.println(originalString.length());
		System.out.println(reverseOrderString.length());

	}

	public static String reverseOrder(String originalString) {

		String[] words = originalString.split(" ");
		Optional<String> reduce = Arrays.stream(words).reduce((word1, word2) -> word2 + " " + word1);
		return reduce.get();

		/*
		 * String finalString = ""; 
		 * for(int i= words.length-1;i>=0;i--) {
		 * finalString+=words[i]+" "; 
		 * } 
		 * return finalString ;
		 * 
		 */

		
		
	}

}
