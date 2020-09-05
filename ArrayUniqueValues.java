
public class ArrayUniqueValues {

	public static void main(String args[]) {

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 2, 4, 5 };

		System.out.println(unique(a1));
		System.out.println(unique(a2));
	}

	public static boolean unique(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
