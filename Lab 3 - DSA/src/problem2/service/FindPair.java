package problem2.service;

public class FindPair {
	public boolean searchpair(Node root, Node temp, int target) {
		if (temp == null)
			return false;

		return search(root, temp, target - temp.data) || searchpair(root, temp.left, target)
				|| searchpair(root, temp.right, target);
	}

	public boolean search(Node root, Node temp, int k) {

		if (root == null)
			return false;

		Node c = root;
		boolean flag = false;
		while (c != null && flag != true) {
			if (c.data == k && temp != c) {
				flag = true;
				System.out.println("Sum = " + (temp.data + c.data));
				System.out.println("Pair is (" + temp.data + "," + c.data + ")");

				return true;
			} else if (k < c.data)
				c = c.left;
			else
				c = c.right;
		}

		return false;
	}

}
