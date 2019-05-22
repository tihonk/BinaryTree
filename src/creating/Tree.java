package creating;

import java.util.Random;

public class Tree
{
    public static void main(String[] args) {
        Random rand = new Random();
        int n=20;
        int[] x = new int[n];
        for(int i=0;i<n;++i)
        {
            x[i]=(rand.nextInt(100));
        }

        for(int i=0;i<n;++i){
            System.out.print(" " + x[i]);
        }
        Node node = new Node(20);
        for(int i=0;i<n;++i)
        {
            node.insertNode(i, node);
        }
//        node.traverse();
    }
}
