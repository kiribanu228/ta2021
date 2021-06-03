/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_7.Lab6_7;

/**
 *
 * @author alaha
 */
public class Lab7 {
    class Node {
	int key;
	Node left, right;

	Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	boolean isMirror(Node node1, Node node2)
	{

		if (node1 == null && node2 == null)
			return true;


		if (node1 != null && node2 != null
			&& node1.key == node2.key)
			return (isMirror(node1.left, node2.right)
					&& isMirror(node1.right, node2.left));


		return false;
	}

	boolean isSymmetric()
	{

		return isMirror(root, root);
	}

}
}
