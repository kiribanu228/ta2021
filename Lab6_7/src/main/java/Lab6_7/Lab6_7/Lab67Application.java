package Lab6_7.Lab6_7;

import Lab6_7.Lab6_7.Lab7.BinaryTree;
import Lab6_7.Lab6_7.Lab7.Node;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab67Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab67Application.class, args);
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(7);
        tree.root.right = new Node(7);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(5);

        tree.root.left.left.left = new Node(2);
        tree.root.left.left.right = new Node(9);

        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(4);

        tree.root.right.left.left = new Node(4);
        tree.root.right.left.right = new Node(10);

        tree.root.right.right.left = new Node(9);
        tree.root.right.right.right = new Node(2);
Show(tree.root);
        boolean output = tree.isSymmetric();
        if (output == true) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not symmetric");
        }
    }
static void Show(Node node) {
		if(node != null) {
			Show(node.left);
			System.out.println(node.key + " ");
			Show(node.right);
		}		
	}
}

public static int solve(int a){                 
		String x = Integer.toOctalString(a); 
                int y = Integer.parseInt(x);
		System.out.println(y);
            return y;
        }
}
