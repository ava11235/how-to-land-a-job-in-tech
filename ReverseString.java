
public class ReverseString {

	public static void main(String[] args) {

		char[] string = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd' };
		char[] result = reverse(string);
		
		for (char ch : result)
			System.out.print(ch);
	}

	public static char[] reverse(char[] string) {

		for (int i = 0; i < string.length / 2; i++) {
			string[i] = (char) (string[i] + string[string.length - i - 1]);
			string[string.length - i - 1] = (char) (string[i] - string[string.length - i - 1]);
			string[i] = (char) (string[i] - string[string.length - i - 1]);
		}

		return string;
	}
}
