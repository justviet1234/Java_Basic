package BSTree;

public class myMain {
	public static void main(String[] args) {
		BSTree tree = new BSTree();
		int[] a = { 1,6,4,7,0,2,9,5,8};
		tree.insertMany(a);
		System.out.println("Pre-order:");
		tree.preOrder(tree.root);
		System.out.println();
		System.out.println("In-order:");
		tree.inOrder(tree.root);
		System.out.println();
		System.out.println("Post-order");
		tree.postOrder(tree.root);
		System.out.println();
		System.out.println("Breadth-first:");
		tree.breadth(tree.root);
		System.out.println();
		System.out.println("Delete by copying:");
		tree.deleByCopy(7);
		tree.breadth(tree.root);
		System.out.println();
	}
}
