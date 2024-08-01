package scott.Revision;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }
    static class BTree {
        Node root;

        void insert(int val) {
            Node newNode = new Node(val);
            Node temp = root;
            if (root == null) {
                root = newNode;
            } else {
                while (true) {
                    if (val > temp.val) {
                        if (temp.right == null) {
                            temp.right = newNode;
                            break;
                        } else {
                            temp = temp.right;
                        }
                    } else {
                        if (temp.left == null) {
                            temp.left = newNode;
                            break;
                        } else {
                            temp = temp.left;
                        }
                    }
                }
            }
        }

        static void PostOrderTraversal(Node node){

            if(node == null){
                return ;
            }

            PostOrderTraversal(node.left);
            PostOrderTraversal(node.right);
            System.out.print(node.val+ " ");


        }

        void InOrderTraversal(Node node) {
            if (node == null) {
                return;
            }

            InOrderTraversal(node.left);

            System.out.print(node.val + " ");

            InOrderTraversal(node.right);
        }

        static void PreOrderTraversal(Node node){

            if(node == null){
                return ;
            }
            System.out.print(node.val+ " ");
            PreOrderTraversal(node.left);
            PreOrderTraversal(node.right);


        }


        static void levelordertraversal(Node node){
            if(node==null){
                return ;
            }

            Queue<Node> q = new LinkedList<>();
            q.offer(node);

            while(!q.isEmpty()) {
                Node currNode = q.poll();
                System.out.print(currNode.val+" ");
                if (currNode.left != null) {
                    q.offer(currNode.left);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        BTree t = new BTree();
        t.insert(4);
        t.insert(2);
        t.insert(6);
        t.insert(1);
        t.insert(3);
        t.insert(5);
        t.insert(7);
        System.out.println("Inorder traversal");
        t.InOrderTraversal(t.root);
        System.out.println();
        System.out.println("Post Order traversal");
        t.PostOrderTraversal(t.root);
        System.out.println();
        System.out.println("Level traversal");
        t.levelordertraversal(t.root);
    }
}
