import java.util.Stack;

public class SameStacks {

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.add(1);
		s1.add(2);
		s1.add(3);

		s2.add(1);
		s2.add(1);
		s2.add(3);

		System.out.println(same(s1, s2));

	}

	public static boolean same(Stack<Integer> s1, Stack<Integer> s2) {
		// use a helper stack
		Stack<Integer> s3 = new Stack<Integer>();
		boolean same = true;
		while (same && !s1.isEmpty() && !s2.isEmpty()) {
			int n1 = s1.pop();
			int n2 = s2.pop();
			if (n1 != n2) {
				// stacks do not contain the same values
				same = false;
			}
			s3.push(n1);
			s3.push(n2);
		}
		same = same && s1.isEmpty() && s2.isEmpty();
		while (!s3.isEmpty()) {
			s2.push(s3.pop());
			s2.push(s3.pop());
		}
		return same;
	}

}

