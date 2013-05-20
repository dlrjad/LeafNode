package Test;

import Struct.Tree;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestLeafNode {
    
    public TestLeafNode() {
    }
    
    @Test
    public void caseBase(){
        Tree  tree = new Tree();
        tree.add(5);
        tree.explorePreorder();
        assertEquals(tree.getCount(), 1);
    }
    
    @Test
    public void moreNodes(){
        Tree  tree = new Tree();
        tree.add(3);
        tree.add(5);
        tree.add(2);
        tree.explorePreorder();
        assertEquals(tree.getCount(), 2);
    }
    
}
