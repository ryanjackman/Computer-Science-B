package Chapter5;

public class SumTree {
	
	private final int highestValue = 3;
	
	public static void main (String[] args){
		new SumTree();
	}
	
	public SumTree(){
		TreeNode tree = new TreeNode(0);
		fillTree(tree);
		System.out.println(sumTree(tree));
	}
	
	// Fills a tree recursively up to highestValue.
	public void fillTree(TreeNode t){
		if((Integer)t.getValue() >= highestValue )
			return;
		t.setLeft(new TreeNode((Integer)t.getValue() + 1));
		t.setRight(new TreeNode((Integer)t.getValue() + 1));
		fillTree(t.getLeft());
		fillTree(t.getRight());
	}
	
	// Finds the sum of all nodes in a tree recursively.
	public int sumTree(TreeNode t){
		
		if(t.getRight() == null)
			return (Integer)t.getValue();
		if(t.getLeft() == null)
			return (Integer)t.getValue();
		
		return (Integer)t.getValue() + sumTree(t.getLeft()) + sumTree(t.getRight());
	}
	
}
