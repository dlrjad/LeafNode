package Struct;

public class Tree {
    
    private Node root = null;
    private int count = 0;
    
    public Tree(){}
    
    public boolean isEmpty(){
        if(root==null) return true;
        else return false;
    }
    
    public Tree add(int dat){
        if(isEmpty()){
            Node new_node =new Node(dat);
            root= new_node;
        }else{
            boolean left;
            Node current = root;
            while(true){
                if(current.element < dat) left = false;
                else left=true;
                if(!left){
                    if(current.right==null){
                        Node new_node = new Node(dat);
                        current.right = new_node;
                        break;
                    }else current=current.right;
                }else{
                    if(current.left==null){
                        Node new_node = new Node(dat);
                        current.left = new_node;
                        break;
                    }else current=current.left;
                }
            }
        }return this;
    }
    
    public void explorePreorder(){
        exploreElementsPreOrder(root);
    }
 
    public void exploreElementsPreOrder(Node dat){
        if(dat!=null){
            if((dat.left == null)&&(dat.right==null)){count++;}
            exploreElementsPreOrder(dat.left);
            exploreElementsPreOrder(dat.right);
        }
    }
    
    public int getCount(){
        return count;
    } 

}
