package wl.p10;

public class BSTree {
	private IntNode pTree;

	public BSTree() {
		pTree = null;
	}

	public IntNode getRoot() {
		return pTree;
	}

	// determine if the tree is empty
	public boolean isEmpty() {
		return (pTree == null);
	}

	// add a node into the tree
	public void add(int value) {
		IntNode newNode, cursor;
		boolean done = false;

		newNode = new IntNode(value, null, null);

		if (isEmpty())
			pTree = newNode;
		else {
			cursor = pTree;
			while (!done) {
				if (value < cursor.getData())
					if (cursor.getLeft() == null) {
						cursor.setLeft(newNode);
						done = true;
					} else
						cursor = cursor.getLeft();
				else {
					if (cursor.getRight() == null) {
						cursor.setRight(newNode);
						done = true;
					} else
						cursor = cursor.getRight();
				}
			}
		}
	}
}
