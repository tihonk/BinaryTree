package creating;

public class Node {

    static Node left;
    static Node right;
    final int data;
    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    public void insertNode(int data,Node node){
        if(node.data<data)
            if(node.right==null){
                node.right = new Node(data);
                System.out.println("\\"+node.data);
            }else insertNode(data, node.right);
        else
        if(node.left==null)
        {
            node.left = new Node(data);
            System.out.println("/"+node.data);
        }
        else insertNode(data, node.left);
    }
    public void traverse(){//обратный обход дерева
        if(left != null)
            left.traverse();
        if(right != null)
            right.traverse();
        System.out.print(" " + data);
    }
}