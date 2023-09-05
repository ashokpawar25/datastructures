package datastructure;


import java.util.Scanner;
class BinaryTree
{
    
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
        }
    }
    
    private Node root;
    public void insertNode(Scanner sc)
    {
        System.out.println("Enter the root node");
        int data=sc.nextInt();
        root=new Node(data);
        insertNode(sc,root);
    }
    
    public void insertNode(Scanner sc,Node node)
    {
        System.out.println("do you want to insert left to the "+ node.data);
        boolean left=sc.nextBoolean();
        if (left)
        {
            System.out.println("Enter data to insert into a node");
            int data=sc.nextInt();
            node.left=new Node(data);
            insertNode(sc,node.left);
        }
        
        System.out.println("do you want to insert right to the "+ node.data);
        boolean right=sc.nextBoolean();
        
        if(right)
        {
            System.out.println("Enter data to insert into a node");
            int data=sc.nextInt();
            node.right=new Node(data);
            insertNode(sc,node.right);
        }
        
    }
    
    
    public void display()
    {
        display(root,0);
    }
    
    public void display(Node node,int level)
    {
        if(node==null)
        {
            return;
        }
        display(node.right,level+1);
        if(level!=0)
        {
            for (int i=0;i<level-1 ;i++)
            {
                System.out.println("|\t\t");
            }
            System.out.println("|------>"+node.data);
        }
        
        else
        {
            System.out.println(node.data);
        }
        
        
        display(node.left,level+1);
    }
    
    public void prettyDisplay() {
        prettyDisplay(root, 0);
      }

      private void prettyDisplay(Node node, int level) {
        if (node == null) {
          return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
          for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t");
          }
          System.out.println("|--->" + node.data);
        } else {
          System.out.println(node.data);
        }
        prettyDisplay(node.left, level + 1);
      }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.insertNode(sc);
//        tree.display();
        tree.prettyDisplay();
    }
}









