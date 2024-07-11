package scott.Trees;


 class Node{
    int val ;
    Node right ;
    Node left ;

    Node(int val){
        this.val = val ;
    }
}

class BST{
Node root ;

     BST(){
        root = null ;
     }

     boolean contains(int x){
         if(root == null) return false ;
         Node temp = root ;

         while(true){
            if(temp.val == x){
                return true ;
            }



            if(x<temp.val){
                if(temp.left !=null){
                    temp = temp.left ;
                }
            }else{
                if(temp.right!=null){
                    temp = temp.right ;
                }
            }

             if(temp.left ==null && temp.right==null){
                 return false ;
             }
         }

     }
     void insert(int val){
        if(root == null){
            Node newNode = new Node(val);
            root = newNode ;
            System.out.println("Root Created: " + val );
        }else{
            Node temp = root ;
            Node newNode = new Node(val);

            while(true){
                if(temp.val > newNode.val){
                    if(temp.left==null){
                        temp.left = newNode;
                        System.out.println("Inserted: " + newNode.val);
                        break ;
                    }else{
                        temp = temp.left ;
                    }
                }else if(temp.val < newNode.val){
                    if(temp.right==null){
                        temp.right = newNode;
                        System.out.println("Inserted: " + newNode.val);
                        break ;
                    }else{
                        temp = temp.right ;
                    }
                }
            }

        }
     }
}
public class BinarySearchTree {

    public static void main(String[] args) {
        BST trr = new BST();
        trr.insert(47);
        trr.insert(21);
        trr.insert(18);
        trr.insert(76);
        trr.insert(52);
        trr.insert(82);
        trr.insert(90);


        System.out.println(trr.contains(90));


    }
}
