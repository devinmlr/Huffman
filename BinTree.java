public class BinTree<T>{
    
    private T item;
    private BinTree<T> left;
    private BinTree<T> right;
    
    BinTree(){
        item = null;
        left = null;
        right = null;
    }
    
    BinTree(T item){
        this.item = item;
        left = null;
        right = null;
    }
        
    public boolean hasItem(){
        return item != null;
    }
    
    public T getItem(){
        return item;
    }
    
    public void setItem(T item){
        this.item = item;
    }
    
    public void deleteItem(){
        this.item = null;
    }
    
    public boolean isLeaf(){
        return left == null && right == null;
    }
    
    public boolean hasLeft(){
        return left != null;    
    }
    
    public BinTree<T> getLeft(){
        return left;    
    }
    
    public void setLeft(BinTree<T> baum){ 
        left = baum;
    }
    
    public void deleteLeft(){
        left = null;
    }
    
    public boolean hasRight(){
        return right != null;     
    }
    
    public BinTree<T> getRight(){
        return right;    
    }
    
    public void setRight(BinTree<T> baum){   
        right = baum;
    }
    
    public void deleteRight(){
        right = null;
    }
    
}
