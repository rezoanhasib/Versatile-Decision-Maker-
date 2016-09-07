import java.util.Scanner; 
/**
 * The <CODE>Tree</CODE> is a Java Applicaton that creates a tree capable of each node holding nine potential childrens 
 * @author rezoanhasib
 * <A> HREF= "mailto:rezoan0308@gmail.com">(rezoan0308@gmail.com)</A>
 */
public class Tree 
{
	private TreeNode root; 
	private TreeNode tempNode;
	Scanner input=new Scanner(System.in);
	boolean debug=false; 
	/**
	 * Constructor to create a tree object with no elements 
	 */
	public Tree()
	{
		root=null; 
	}
	/*
	//replacement of the equals() method to compare two strings 
	public boolean isEqual(String label1,String label2)
	{
		label1=label1.trim(); 
		label2=label2.trim(); 
		//test
		System.out.println(label1.length()+" "+label2.length());
		
		if (label1.length()!=label2.length())
			return false; 
		for(int a=0;a<label1.length()-1;a++)
		{
			if(label1.charAt(a)!=label2.charAt(a))
				return false; 
		}
		return true; 		
	}
	*/
	/**
	 * Method to obtain the parent node of the current node 
	 * @param root
	 * 		root of the tree
	 * @param parentLabel
	 * 		label of the parent node 
	 * @return
	 * 		the parent node of the selected node 
	 */
	public TreeNode getNodeReference_helper(TreeNode root, String parentLabel) {
		if(debug)
		{
			System.out.println(root.getLabel()+" "+root.getLabel().length());
			System.out.println(parentLabel+" "+parentLabel.length());
		}
		if((root.getLabel().trim()).equals(parentLabel.trim()))
			return root;
		else if(root.getLeft()!=null && (root.getLeft().getLabel().trim()).equals(parentLabel.trim()))
			return root.getLeft(); 
		else if(root.getMiddle()!=null && (root.getMiddle().getLabel().trim()).equals(parentLabel.trim()))
			return root.getMiddle(); 
		else if(root.getRight()!=null && (root.getRight().getLabel().trim()).equals(parentLabel.trim()))
			return root.getRight();
		else if(root.get4()!=null && (root.get4().getLabel().trim()).equals(parentLabel.trim()))
			return root.get4(); 
		else if(root.get5()!=null && (root.get5().getLabel().trim()).equals(parentLabel.trim()))
			return root.get5();
		else if(root.get6()!=null && (root.get6().getLabel().trim()).equals(parentLabel.trim()))
			return root.get6();
		else if(root.get7()!=null && (root.get7().getLabel().trim()).equals(parentLabel.trim()))
			return root.get7();
		else if(root.get8()!=null && (root.get8().getLabel().trim()).equals(parentLabel.trim()))
			return root.get8();
		else if(root.get9()!=null && (root.get9().getLabel().trim()).equals(parentLabel.trim()))
			return root.get9();
		//recursive call starts from below
		if(root.getLeft()!=null)
		{
			tempNode=getNodeReference_helper(root.getLeft(),parentLabel);
			if(tempNode!=null)
				return tempNode; 
		}
		if(root.getMiddle()!=null)
		{
			tempNode=getNodeReference_helper(root.getMiddle(),parentLabel);
			if(tempNode!=null)
				return tempNode;
		}
		if(root.getRight()!=null)
		{
			tempNode=getNodeReference_helper(root.getRight(),parentLabel); 
			if(tempNode!=null)
				return tempNode;
		}
		if(root.get4()!=null)
		{
			tempNode=getNodeReference_helper(root.get4(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		if(root.get5()!=null)
		{
			tempNode=getNodeReference_helper(root.get5(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		if(root.get6()!=null)
		{
			tempNode=getNodeReference_helper(root.get6(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		if(root.get7()!=null)
		{
			tempNode=getNodeReference_helper(root.get7(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		if(root.get8()!=null)
		{
			tempNode=getNodeReference_helper(root.get8(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		if(root.get9()!=null)
		{
			tempNode=getNodeReference_helper(root.get9(),parentLabel); 
			if(tempNode!=null)
				return tempNode; 		
		}
		//if the parent node is not found
		return null;		
	}
	/**
	 * This method finds a node in the tree with the given node label
	 * @param root
	 * 		the root of the tree 
	 * @param parentLabel
	 * 		the label of the node to search for 
	 * @return
	 * 		the node reference found that matches with the given label 
	 */
	//Can the method signature be different than given for this method? 
	public TreeNode getNodeReference(String parentLabel)
	{
		return getNodeReference_helper(this.root,parentLabel);	
	}
	/**
	 * Method to add a new node in the existing tree 
	 * @param label
	 * 		label of the node to be added 
	 * @param prompt
	 * 		prompt of the node to be added 
	 * @param message
	 * 		message of the node to be added 
	 * @param parentLabel
	 * 		parentLabel of the node to be added 
	 * @return
	 * 		true if the node was added, false otherwise 
	 */
	public boolean addNode(String label, String prompt, String message, String parentLabel) 
	{
		if(debug)
		{
			System.out.println(label);
			System.out.println(prompt);
			System.out.println(message);
			System.out.println(parentLabel);
		}		
		TreeNode newNode=getNodeReference(parentLabel); 
		if(newNode==null)
			throw new NullPointerException(); 		
		if(debug)
		{
			System.out.println(newNode.getMessage());
		}
		if(newNode.getLeft()==null)
		{
			addNodeLeft(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.getMiddle()==null)
		{
			addNodeMiddle(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.getRight()==null)
		{
			addNodeRight(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get4()==null)
		{
			addNode4(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get5()==null)
		{
			addNode5(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get6()==null)
		{
			addNode6(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get7()==null)
		{
			addNode7(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get8()==null)
		{
			addNode8(label,prompt,message,newNode); 
			return true; 
		}
		else if(newNode.get9()==null)
		{
			addNode9(label,prompt,message,newNode); 
			return true; 
		}
		else 
			return false; 
	}
	/**
	 * Method to set the root of the tree 
	 * @param node
	 * 		the reference node which needs to be set as the root 
	 * @throws CloneNotSupportedException
	 * 		informs if the cloning done in the method was not successfull
	 * @postcondition
	 * 		the root of the tree is set  
	 */
	public void setRoot(TreeNode node) throws CloneNotSupportedException
	{
		root=(TreeNode)node.clone(); 
		root.setLeft(null);
		root.setMiddle(null);
		root.setRight(null);
		root.set4(null);
		root.set5(null);
		root.set6(null);
		root.set7(null);
		root.set8(null);
		root.set9(null);

		if(debug)
		{
			System.out.println("Root set!! "+root.getLabel());
		}	
	}
	/**
	 * Method to obtain the root of the tree 
	 * @return
	 * 		the root of the existing tree 
	 */
	public TreeNode getRoot()
	{
		return root; 
	}
	/**
	 * Method to add a node on the left of the parentNode 
	 * @param label
	 * 		label of the new node 
	 * @param prompt
	 * 		prompt of the new node 
	 * @param message
	 * 		message of the new node 
	 * @param parentNode
	 * 		parent node of the new node 
	 * @postcondition 
	 * 		the new node is added to the left of the parent node 
	 */
	public void addNodeLeft(String label, String prompt, String message,TreeNode parentNode)
	{
		if(debug)
		{
			System.out.println("Node created on the left");
		}		
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		//setting up the node in the left of the parent node 
		parentNode.setLeft(newNode); 
	}
	/**
	 * Method to add a node on the middle of the parentNode 
	 * @param label
	 * 		label of the new node 
	 * @param prompt
	 * 		prompt of the new node 
	 * @param message
	 * 		message of the new node 
	 * @param parentNode
	 * 		parent node of the new node 
	 * @postcondition 
	 * 		the new node is added to the middle of the parent node 
	 */
	public void addNodeMiddle(String label,String prompt,String message,TreeNode parentNode)
	{
		if(debug)
		{
			System.out.println("Node created on the middle");
		}		
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.setMiddle(newNode);
	}
	/**
	 * Method to add a node on the right of the parentNode 
	 * @param label
	 * 		label of the new node 
	 * @param prompt
	 * 		prompt of the new node 
	 * @param message
	 * 		message of the new node 
	 * @param parentNode
	 * 		parent node of the new node
	 * @postcondition 
	 * 		the new node is added to the right of the parent node  
	 */
	public void addNodeRight(String label,String prompt,String message,TreeNode parentNode)
	{
		if(debug)
		{
			System.out.println("Node created on the right");
		}
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.setRight(newNode);
	}
	/**
	 * Method to add the 4th child of a node 
	 * @param label
	 * 		label of the child 
	 * @param prompt
	 * 		prompt of the child 
	 * @param message
	 * 		prompt of the child 
	 * @param parentNode
	 * 		parent node of the child 
	 * @postcondition 
	 * 		4th child of selected node is set 
	 */
	public void addNode4(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set4(newNode); 
	}
	/**
	 * Method to add the 5th child of a node 
	 * @param label
	 * 		label of the child 
	 * @param prompt
	 * 		prompt of the child 
	 * @param message
	 * 		prompt of the child 
	 * @param parentNode
	 * 		parent node of the child 
	 * @postcondition 
	 * 		5th child of selected node is set 
	 */
	public void addNode5(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set5(newNode); 
	}
	/**
	 * Method to add the 6th child of a node 
	 * @param label
	 * 		label of the child 
	 * @param prompt
	 * 		prompt of the child 
	 * @param message
	 * 		prompt of the child 
	 * @param parentNode
	 * 		parent node of the child 
	 * @postcondition 
	 * 		6th child of selected node is set 
	 */
	public void addNode6(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set6(newNode); 
	}
	public void addNode7(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set7(newNode); 
	}
	public void addNode8(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set8(newNode); 
	}
	public void addNode9(String label,String prompt,String message,TreeNode parentNode)
	{
		TreeNode newNode=new TreeNode(label,prompt,message); 
		newNode.setLeft(null);
		newNode.setMiddle(null);
		newNode.setRight(null);
		newNode.set4(null);
		newNode.set5(null);
		newNode.set6(null);
		newNode.set7(null);
		newNode.set8(null);
		newNode.set9(null);
		newNode.setParentNode(parentNode);
		parentNode.set9(newNode); 
	}
	/**
	 * Method to print the tree info in pre-order 
	 * @throws EmptyTreeException 
	 * 		informs if the tree is empty 
	 */
    public void preOrder() throws EmptyTreeException
    {
    	if(root==null)
    		throw new EmptyTreeException("No tree is loaded at this time!"); 
    	if(root!=null)
    		preOrder(root); 
    }
    /**
     * Helper method of preOrder() method 
     * @param root
     * 		the root of the tree 
     */
    public void preOrder(TreeNode root)
    {
    	System.out.println("Label: "+root.getLabel());
    	System.out.println("Prompt: "+root.getPrompt());
    	System.out.println("Message: "+root.getMessage()+"\n");
    	
    	if(root.getLeft()!=null)
    		preOrder(root.getLeft()); 
    	if(root.getMiddle()!=null)
    		preOrder(root.getMiddle()); 
    	if(root.getRight()!=null)
    		preOrder(root.getRight()); 
    	if(root.get4()!=null)
    		preOrder(root.get4()); 
    	if(root.get5()!=null)
    		preOrder(root.get5());
    	if(root.get6()!=null)
    		preOrder(root.get6());
    	if(root.get7()!=null)
    		preOrder(root.get7());
    	if(root.get8()!=null)
    		preOrder(root.get8());
    	if(root.get9()!=null)
    		preOrder(root.get9());   	
    }	
    /**
     * Method to begin the helping session for the user 
     * @throws EmptyTreeException 
     * @postcondition 
     * 		the helping session for the user has begun 
     */
    public void beginSession() throws EmptyTreeException
    {
    	if(root==null)
    		throw new EmptyTreeException("No tree is loaded at this time");
    	String choice1; 
    	if(root.isLeaf()==true)
		{
			System.out.println(root.getMessage()+"\n");
			return; 
		}
    	
    	System.out.println(root.getMessage());
    	//condition for 9 children 
    	for(int a=0;a<root.getChildNumber();a++)
    	{
    		if(a==0)
    			System.out.println((a+1)+"-"+root.getLeft().getPrompt());
    		if(a==1)
    			System.out.println((a+1)+"-"+root.getMiddle().getPrompt());
    		if(a==2)
    			System.out.println((a+1)+"-"+root.getRight().getPrompt());
    		if(a==3)
    			System.out.println((a+1)+"-"+root.get4().getPrompt());
    		if(a==4)
    			System.out.println((a+1)+"-"+root.get5().getPrompt());
    		if(a==5)
    			System.out.println((a+1)+"-"+root.get6().getPrompt());
    		if(a==6)
    			System.out.println((a+1)+"-"+root.get7().getPrompt());
    		if(a==7)
    			System.out.println((a+1)+"-"+root.get8().getPrompt());
    		if(a==8)
    			System.out.println((a+1)+"-"+root.get9().getPrompt());
    	}
    	System.out.println("0-Exit Session");
    	System.out.print("Choice>");
    	choice1=input.nextLine();
    	switch(choice1)
    	{
    		//user comes to the left subtree 
    		case "1":
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getLeft().getMessage());
    			sessionHelper(root.getLeft());
    			break; 
    		}
    		//user comes to the middle subtree 
    		case "2": 
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getMiddle().getMessage());
    			sessionHelper(root.getMiddle()); 
    			break; 
    		}
    		//user comes to the right subtree 
    		case "3": 
    		{
    	    	System.out.println("\n");
    			System.out.println(root.getRight().getMessage());
    			sessionHelper(root.getRight()); 
    			break; 
    		}
    		case"4": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get4().getMessage());
    			sessionHelper(root.get4()); 
    			break; 
    		}
    		case"5": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get5().getMessage());
    			sessionHelper(root.get5()); 
    			break; 
    		}
    		case"6": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get6().getMessage());
    			sessionHelper(root.get6()); 
    			break; 
    		}
    		case"7": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get7().getMessage());
    			sessionHelper(root.get7()); 
    			break; 
    		}
    		case"8": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get8().getMessage());
    			sessionHelper(root.get8()); 
    			break; 
    		}
    		case"9": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get9().getMessage());
    			sessionHelper(root.get9()); 
    			break; 
    		}
    		case "0": 
    		{
    			return; 
    		}
    	}    	  	
    }
    /**
     * Helper method of the beginSession() method 
     * @param node
     * 		the node of the tree currently dealing with 
     */
    public void sessionHelper(TreeNode node)
    {
    	//if the node is leaf, print the message and return to menu
		if(node.isLeaf()==true)
		{
			System.out.println(node.getMessage()+"\n");
			return; 
		}
		
    	String choice2; 
    	
    	for(int a=0;a<node.getChildNumber();a++)
    	{
    		if(a==0)
    			System.out.println((a+1)+"-"+node.getLeft().getPrompt());
    		if(a==1)
    			System.out.println((a+1)+"-"+node.getMiddle().getPrompt());
    		if(a==2)
    			System.out.println((a+1)+"-"+node.getRight().getPrompt());
    		if(a==3)
    			System.out.println((a+1)+"-"+root.get4().getPrompt());
    		if(a==4)
    			System.out.println((a+1)+"-"+root.get5().getPrompt());
    		if(a==5)
    			System.out.println((a+1)+"-"+root.get6().getPrompt());
    		if(a==6)
    			System.out.println((a+1)+"-"+root.get7().getPrompt());
    		if(a==7)
    			System.out.println((a+1)+"-"+root.get8().getPrompt());
    		if(a==8)
    			System.out.println((a+1)+"-"+root.get9().getPrompt());
    	}
    	System.out.println("b-Back to previous menu");
    	System.out.println("0-Exit Session");
      	System.out.print("Choice>");
    	choice2=input.nextLine();
    	
    	switch(choice2)
    	{
    		//comes to left subtree 
    		case "1": 
    		{	
    	    	System.out.println("\n");
    			System.out.println(node.getLeft().getMessage());
    			sessionHelper(node.getLeft()); 
    			break; 
    		}
    		//comes to middle subtree 
    		case "2": 
    		{
    	    	System.out.println("\n");
    			System.out.println(node.getMiddle().getMessage());
    			sessionHelper(node.getMiddle()); 
    			break; 
    		}
    		//comes to right subtree 
    		case "3": 
    		{
    	    	System.out.println("\n");
    			System.out.println(node.getRight().getMessage());
    			sessionHelper(node.getRight()); 
    			break; 
    		}
    		case"4": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get4().getMessage());
    			sessionHelper(root.get4()); 
    			break; 
    		}
    		case"5": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get5().getMessage());
    			sessionHelper(root.get5()); 
    			break; 
    		}
    		case"6": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get6().getMessage());
    			sessionHelper(root.get6()); 
    			break; 
    		}
    		case"7": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get7().getMessage());
    			sessionHelper(root.get7()); 
    			break; 
    		}
    		case"8": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get8().getMessage());
    			sessionHelper(root.get8()); 
    			break; 
    		}
    		case"9": 
    		{
    			System.out.println("\n");
    			System.out.println(root.get9().getMessage());
    			sessionHelper(root.get9()); 
    			break; 
    		}
    		case "b": 
    		{
    			System.out.println("\nYou have selected to go to the previous menu! Going back..\n");
    			System.out.println(node.getParentNode().getMessage());
    			sessionHelper(node.getParentNode()); 
    		}
    		case "0": 
    		{
    			return; 
    		}
    	}
    }

}
