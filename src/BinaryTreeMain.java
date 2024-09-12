class NodeB{
	int data;
	NodeB leftNode;
	NodeB rightNode;
	NodeB(int data)
	{
		this.data=data;
	}
}
class BinaryTree
{
	NodeB root;
	public void insert(int data) {
		// TODO Auto-generated method stub
		root=insertRecusrion(root,data);
	}
	public NodeB insertRecusrion(NodeB root,int data)
	{
		if(root==null)
		{
		NodeB node=new NodeB(data);
		root=node;
		}
		else if(data<root.data)
		{
			root.leftNode=insertRecusrion(root.leftNode,data);
		}
		else
		{
			root.rightNode=insertRecusrion(root.rightNode,data);
		}
		return root;
	}
	public void inorder()
	{
		inOrderRecursion(root);
	}
	public void inOrderRecursion(NodeB root)
	{
		if(root !=null)
		{
			inOrderRecursion(root.leftNode);
			System.out.print(root.data + " ");
			inOrderRecursion(root.rightNode);
			
		}
	}
	public void preorder()
	{
		preRecursion(root);
	}
	public void preRecursion(NodeB root)
	{
		if(root !=null)
		{
			System.out.print(root.data + " ");
			inOrderRecursion(root.leftNode);
			inOrderRecursion(root.rightNode);
		}
	}
	public void postorder()
	{
		postRecursion(root);
	}
	public void postRecursion(NodeB root)
	{
		if(root !=null)
		{
			
			inOrderRecursion(root.leftNode);
			inOrderRecursion(root.rightNode);
			System.out.print(root.data + " ");
		}
	}
}
public class BinaryTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree=new BinaryTree();
		tree.insert(10);
		tree.insert(2);
		tree.insert(7);
		tree.insert(11);
		tree.insert(29);
		tree.inorder();
		System.out.println();
		tree.postorder();
		System.out.println();
		tree.preorder();
	}

}
