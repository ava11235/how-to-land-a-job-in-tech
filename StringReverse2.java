
import org.junit.Assert;
import org.junit.Test;

public class StringReverse2 {

	// method to reverse a string by converting it to array of chars
	public static String reverse(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		char[] ch = s.toCharArray();
		int i = 0;
		int j = ch.length - 1;
		while (i < j) {
			swap(ch, i, j);
			i++;
			j--;
		}
		return new String(ch);
	}

	// helper method
	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Test with jUnit assertions
	@Test
	public void testReverse() {
		Assert.assertEquals("cat", reverse("tac"));
	}

	@Test
	public void testReverseNull() {
		Assert.assertEquals(null, reverse(null));
	}

	@Test
	public void testReverseEmpty() {
		Assert.assertEquals("", reverse(""));
	}

}
