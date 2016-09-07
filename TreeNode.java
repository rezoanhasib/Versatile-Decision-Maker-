/**
 * The <CODE>TreeNode</CODE> is a Java Applicaton that creates a node of a tree that has 
 * a label, a messge and a prompt field and can have upto 3 childrens 
 * @author rezoanhasib
 * <A> HREF= "mailto:rezoan0308@gmail.com">(rezoan0308@gmail.com)</A>
 */
public class TreeNode implements Cloneable{
	
	private TreeNode[] nodeArray=new TreeNode[9]; 
	private String label; 
	private String message; 
	private String prompt;
	private int childNumber;
	boolean debug=false; 
	private TreeNode parentNode; 
	/**
	 * Constructor to create a node that does not have any content in it 
	 */
	//left=0,middle=1,right=2
	public TreeNode()
	{
		
		for(int a=0;a<9;a++)
		{
			nodeArray[a]=null; 
		}		
		//nodeArray[0]=nodeArray[1]=nodeArray[2]=null; 
		label=message=prompt=null; 
	}
	/**
	 * Constructor to create a node for the tree with given parameters 
	 * @param label
	 *		label of the node 
	 * @param prompt
	 * 		prompt of the node 
	 * @param message
	 * 		message of the node 
	 */
	public TreeNode(String label,String prompt,String message)
	{
		this.label=label; 
		this.prompt=prompt; 
		this.message=message; 
	}
	/**
	 * Method to obtain the childNumber of a node 
	 * @return
	 * 		child number of given node 
	 */
	public int getChildNumber()
	{
		return childNumber; 
	}
	/**
	 * Method to obtain the left child of a node 
	 * @return
	 * 		the left child of selected node 
	 */
	public TreeNode getLeft()
	{
		return nodeArray[0]; 
	}
	/**
	 * Method to obtain the middle child of a node 
	 * @return
	 * 		the middle child of selected node 
	 */
	public TreeNode getMiddle()
	{
		return nodeArray[1]; 
	}
	/**
	 * Method to obtain the right child of a node 
	 * @return
	 * 		the right child of selected node 
	 */
	public TreeNode getRight()
	{
		return nodeArray[2];  
	}
	/**
	 * Method to obtain the label of a node 
	 * @return
	 * 		the label of selected node 
	 */
	public String getLabel()
	{
		return label; 
	}
	/**
	 * Method to obtain the 4th child of a node 
	 * @return
	 * 		the 4th child of selected node 
	 */
	public TreeNode get4()
	{
		return nodeArray[3]; 
	}
	/**
	 * Method to obtain the 5th child of a node 
	 * @return
	 * 		the 5th child of selected node 
	 */
	public TreeNode get5()
	{
		return nodeArray[4]; 
	}
	/**
	 * Method to obtain the 6th child of a node 
	 * @return
	 * 		the 6th child of selected node 
	 */
	public TreeNode get6()
	{
		return nodeArray[5]; 
	}
	/**
	 * Method to obtain the 7th child of a node 
	 * @return
	 * 		the 7th child of selected node 
	 */
	public TreeNode get7()
	{
		return nodeArray[6]; 
	}
	/**
	 * Method to obtain the 8th child of a node 
	 * @return
	 * 		the 8th child of selected node 
	 */
	public TreeNode get8()
	{
		return nodeArray[7]; 
	}
	/**
	 * Method to obtain the 4th child of a node 
	 * @return
	 * 		the 4th child of selected node 
	 */
	public TreeNode get9()
	{
		return nodeArray[8]; 
	}
	/**
	 * Method to obtain the message of a node 
	 * @return
	 * 		the message of selected node 
	 */
	public String getMessage()
	{
		return message; 
	}
	/**
	 * Method to obtain the prompt of a node 
	 * @return
	 * 		the prompt of selected node 
	 */
	public String getPrompt()
	{
		return prompt; 
	}
	/**
	 * Method to set the child number of a node 
	 * @param childNumber
	 * 		the number of childs 
	 * @postcondition 
	 * 		the child number of selected node is set
	 */
	public void setChildNumber(int childNumber)
	{
		this.childNumber=childNumber; 
	}
	/**
	 * Method to set the label of a node 
	 * @param label
	 * 		the label of selected node 
	 * @throws StringOutOfRangeException 
	 * 		informs if string is out of range 
	 * @postcondition 
	 * 		the label of selected node is set 
	 */
	public void setLabel(String label) throws StringOutOfRangeException
	{
		if(debug)
		{
			System.out.println(label);
		}
		if(label.length()>60)
			throw new StringOutOfRangeException("String is more than 60 characters!"); 
		this.label=label; 
	}
	/**
	 * Method to set the message of a node 
	 * @param message
	 * 		message of selected node
	 * @throws StringOutOfRangeException 
	 * 		informs if string is more than 60 characters 
	 * @postconditon 
	 * 		message of selected node is set 
	 */
	public void setMessage(String message) throws StringOutOfRangeException
	{
		if(message.length()>60)
			throw new StringOutOfRangeException("String is more than 60 characters!"); 
		if(debug)
		{
			System.out.println(message);
		}
		this.message=message; 
	}
	/**
	 * Method to set the prompt of a node 
	 * @param message
	 * 		prompt of selected node
	 * @throws StringOutOfRangeException 
	 * 		informs if string is more than 60 characters 
	 * @postconditon 
	 * 		prompt of selected node is set 
	 */
	public void setPrompt(String prompt) throws StringOutOfRangeException
	{
		if(prompt.length()>60)
			throw new StringOutOfRangeException("String is more than 60 characters!"); 
		this.prompt=prompt; 
	}
	/**
	 * Method to set the left child of a node 
	 * @param message
	 * 		left child of selected node
	 * @postconditon 
	 * 		left child of selected node is set 
	 */
	public void setLeft(TreeNode left)
	{
		this.nodeArray[0]=left; 
	}
	/**
	 * Method to set the middle child of a node 
	 * @param message
	 * 		middle child of selected node
	 * @postconditon 
	 * 		middle child of selected node is set 
	 */
	public void setMiddle(TreeNode middle)
	{
		this.nodeArray[1]=middle; 
	}
	/**
	 * Method to set the right child of a node 
	 * @param message
	 * 		right child of selected node
	 * @postconditon 
	 * 		right child of selected node is set 
	 */
	public void setRight(TreeNode right)
	{
		this.nodeArray[2]=right; 
	}
	/**
	 * Method to set the 4th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set4(TreeNode node)
	{
		this.nodeArray[3]=node; 
	}
	/**
	 * Method to set the 5th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set5(TreeNode node)
	{
		this.nodeArray[4]=node; 
	}
	/**
	 * Method to set the 6th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set6(TreeNode node)
	{
		this.nodeArray[5]=node; 
	}
	/**
	 * Method to set the 7th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set7(TreeNode node)
	{
		this.nodeArray[6]=node; 
	}
	/**
	 * Method to set the 8th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set8(TreeNode node)
	{
		this.nodeArray[7]=node; 
	}
	/**
	 * Method to set the 9th child of a node 
	 * @param node
	 * 		the child to be set 
	 * @postcondition 
	 * 		the child is set for selected node 
	 */
	public void set9(TreeNode node)
	{
		this.nodeArray[8]=node; 
	}
	/**
	 * Method to determine if a node is a leaf 
	 * @return
	 * 		true is selected node is leaf, false otherwise 
	 */
	public boolean isLeaf()
	{
		if(nodeArray[0]==null && nodeArray[1]==null && nodeArray[2]==null)
			return true;
		else 
			return false; 
	}
	/**
	 * Override clone() method of the Object class 
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
	/**
	 * Mehod to obtain the parent node of a node 
	 * @return
	 * 		the parent node of selected node 
	 */
	//case "b" helper method 
	public TreeNode getParentNode()
	{
		return parentNode; 
	}
	/**
	 * Method to set the parent node of a node
	 * @postcondition 
	 * 		the parent node of selected node is set 
	 */
	//case "b" helper method
	public void setParentNode(TreeNode parentNode)
	{
		this.parentNode=parentNode; 
	}
}
