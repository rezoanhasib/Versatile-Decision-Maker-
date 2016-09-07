import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * The <CODE>TreeDriver</CODE> is a Java Applicaton that has a main method to interact with the user to load a file,
 * make a tree or traverse the tree in perorder
 * @author rezoanhasib
 * <A> HREF= "mailto:rezoan0308@gmail.com">(rezoan0308@gmail.com)</A>
 */
public class TreeDriver 
{
	/**
	 * This main method interacts with the user giving the option to build a tree from an input file, 
	 * begin a help session to solve users problems or traverse the tree in preorder 
	 * @param args
	 * @throws IOException
	 * 		Informs if there's a problem with the format of a line in the text file 	
	 * @throws CloneNotSupportedException
	 * 		Informs if the pointer is pointing to a null reference 
	 * @throws EmptyTreeException
	 * 		Informs if the tree is empty and session is intended to start 
	 */
	public static void main(String[] args) throws IOException,CloneNotSupportedException,EmptyTreeException 

	{
		Scanner input=new Scanner(System.in); 
		Tree currentTree=new Tree(); 
		TreeNode currentNode = new TreeNode(); 
		BufferedReader reader; 
		int childNumber; 
		int childTracker=0;
		String parentLabel="";
		String[] tokens;
		boolean debug=false; 
		boolean flag=true;
		
		while(flag)
		{
			System.out.println("Menu:");
			System.out.println("----\n"); 
			System.out.println("L - Load a Tree.");
			System.out.println("H - Begin a Help Session.");
			System.out.println("T - Traverse the Tree in preorder.");
			System.out.println("Q - Quit\n"); 
			System.out.println("Please enter a choice: "); 
			String choice=input.nextLine();
			choice=choice.toLowerCase(); 
		
		switch(choice)
		{ 
			//if "Load a Tree" is choosen 
			case"l": 
			{
				String line=""; 
				
				System.out.println("You have selected to load a tree!");
				System.out.println("Please enter the file name: ");
				String fileName=input.nextLine();
				
				try
				{
					reader=new BufferedReader(new FileReader(fileName));
				
					line=reader.readLine(); 
					int a=1;
					
					while(line!=null)
					{
						for(;a<=4;)
						{
							if(a==1)
							{
								/*
								if(childTracker>0)
								{
									currentNode.setParentNode(currentTree.getNodeReference(parentLabel));
								}
								*/
								if(debug)
								{
									if(currentTree.getRoot()!=null)
										System.out.println(currentTree.getRoot().getLabel());
								}
								
								//setting up the label for temporary node 
								currentNode.setLabel(line);
								
								if(debug)
								{
									if(currentTree.getRoot()!=null)
										System.out.println(currentTree.getRoot().getLabel());
									System.out.println(currentNode.getLabel());
								}
								break; 
							}
							else if(a==2)
							{
								//setting up the prompt for the temporary node 
								currentNode.setPrompt(line);
								if(debug)
								{
									System.out.println(currentNode.getPrompt());
								}
								break; 
							}
							else if(a==3)
							{
								//setting up the message for the temporary node 
								currentNode.setMessage(line);
								if(debug)
								{
									System.out.println(currentNode.getMessage());
								}
								
								if(currentTree.getRoot()==null)	
									break;
								
								else
								{
									if(debug)
									{
										System.out.println(currentNode.getLabel()+" "+currentNode.getPrompt()+" "+currentNode.getMessage()+" "+parentLabel);
									}							
									currentTree.addNode(currentNode.getLabel(), currentNode.getPrompt(), currentNode.getMessage(),parentLabel);
									childTracker--;								
									if(debug)
									{
										System.out.println(childTracker);
									}
									if(childTracker<1)
									{
										break; 
									}
									
									a=0; 
									break; 
								}
							}
							else if(a==4)
							{
								//this part splits the line,first part is the label and second is the no. of children 
								tokens=line.split(" "); 
								if(tokens.length!=2) throw new IllegalArgumentException(); 
								parentLabel=tokens[0]; 
								childNumber=Integer.parseInt(tokens[1]);
								if(debug)
								{
									System.out.println(parentLabel+" "+childNumber);
								} 
								if(currentTree.getRoot()==null)
								{
									currentTree.setRoot(currentNode);
									childTracker=childNumber; 
								}
								else
								{
									childTracker=childNumber; 
									
								}
								
								//setting the number of children for the parentLabel found in the beginning of this else if condition
								(currentTree.getNodeReference(parentLabel)).setChildNumber(childNumber); 							
								if(debug)
								{
									currentTree.preOrder(); 
									System.out.println(childTracker);
								}
								
								a=0;
								break; 
							}
						}
						//reading the next line in the file 
						line=reader.readLine();
						a++; 						
						if(debug)
						{
							System.out.println(line+" "+a); 
						}
					}
				}catch(FileNotFoundException e)
				{
					System.out.println("File not found!!");	
					e.printStackTrace();
				} catch (StringOutOfRangeException e) {
					e.printStackTrace();
				}
				System.out.println("\nTree created successfully!\n");
				break; 
			}
			
			case"h": 
			{
				System.out.println("You have selected to begin a help session!");
				System.out.println("Session starting...");
		    	System.out.println("(Please enter any of the corresponding digit that matches your answer)\n");				
				try
				{
					currentTree.beginSession();
				}catch(EmptyTreeException e)
				{
					e.printStackTrace(); 
				}
				if(currentTree.getRoot()!=null)
				System.out.println("\nThank you for using the automated help service!\n");
				break; 
			}
			case"t": 
			{
				System.out.println("Traversing the tree in preorder: \n");
				try
				{
					currentTree.preOrder();
				}catch(EmptyTreeException e)
				{
					e.printStackTrace();
				}
				break; 
			}
			case"q": 
			{
				System.out.println("Thank you for using our automated help system!");
				System.out.println("Program terminating normally...");
				flag=false; 
				break; 
			}
			default: 
			{
				System.out.println("Invalid choice!! Please enter an option from the menu..\n");
				break; 			
			}
			
		}
		
		}
		
		input.close(); 
	}
}
