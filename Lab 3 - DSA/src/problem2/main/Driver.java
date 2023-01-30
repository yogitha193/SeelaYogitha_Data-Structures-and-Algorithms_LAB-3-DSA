package problem2.main;

import problem2.service.BinarySearchTree;
import problem2.service.FindPair;

public class Driver {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);

		FindPair findpair = new FindPair();

		boolean test = findpair.searchpair(tree.root,tree.root, 130);
		
		if (!test)
			System.out.println("No nodes are found!");
	}

}
