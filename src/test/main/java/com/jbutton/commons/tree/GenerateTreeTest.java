package test.main.java.com.jbutton.commons.tree; 

import main.java.com.jbutton.commons.tree.GenerateTree;
import main.java.com.jbutton.commons.tree.model.TreeNode;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/** 
* GenerateTree Tester. 
* 
* @author <Authors name> 
* @since <pre>10/18/2018</pre> 
* @version 1.0 
*/ 
public class GenerateTreeTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: listToTree(List<TreeNode> allNodes, String rootNodeId) 
* 
*/ 
@Test
public void testListToTree() throws Exception {
    TreeNode treeNode = new TreeNode();
    treeNode.setId("10");
    treeNode.setpId(null);
    treeNode.setTitle("root");
    treeNode.setType(0);
    TreeNode treeNode8 = new TreeNode();
    treeNode8.setId("30");
    treeNode8.setpId(null);
    treeNode8.setTitle("root30");
    treeNode8.setType(0);

    TreeNode treeNode2 = new TreeNode();
    treeNode2.setId("11");
    treeNode2.setpId("10");
    treeNode2.setTitle("root1");
    treeNode2.setType(0);

    TreeNode treeNode3 = new TreeNode();
    treeNode3.setId("12");
    treeNode3.setpId("11");
    treeNode3.setTitle("root2");
    treeNode3.setType(0);

    TreeNode treeNode4 = new TreeNode();
    treeNode4.setId("13");
    treeNode4.setpId("10");
    treeNode4.setTitle("root3");
    treeNode4.setType(0);

    TreeNode treeNode5 = new TreeNode();
    treeNode5.setId("20");
    treeNode5.setpId("13");
    treeNode5.setTitle("file1");
    treeNode5.setType(1);

    TreeNode treeNode9 = new TreeNode();
    treeNode9.setId("24");
    treeNode9.setpId("13");
    treeNode9.setTitle("file4");
    treeNode9.setType(1);

    TreeNode treeNode6 = new TreeNode();
    treeNode6.setId("21");
    treeNode6.setpId("11");
    treeNode6.setTitle("file2");
    treeNode6.setType(1);

    TreeNode treeNode7 = new TreeNode();
    treeNode7.setId("22");
    treeNode7.setpId("12");
    treeNode7.setTitle("file3");
    treeNode7.setType(1);

    TreeNode treeNode10 = new TreeNode();
    treeNode10.setId("22");
    treeNode10.setpId("10");
    treeNode10.setTitle("file5");
    treeNode10.setType(1);

    TreeNode treeNode11 = new TreeNode();
    treeNode11.setId("22");
    treeNode11.setpId("10");
    treeNode11.setTitle("file6");
    treeNode11.setType(1);

    ArrayList<TreeNode> nodesList = new ArrayList<>();
    nodesList.add(treeNode2);
    nodesList.add(treeNode3);
    nodesList.add(treeNode4);
    nodesList.add(treeNode5);
    nodesList.add(treeNode6);
    nodesList.add(treeNode7);
    nodesList.add(treeNode8);
    nodesList.add(treeNode9);
    nodesList.add(treeNode10);
    nodesList.add(treeNode11);
    nodesList.add(treeNode);
    List<TreeNode> treeNodes = GenerateTree.listToTree(nodesList, null);
    System.out.println(treeNodes);

} 


/** 
* 
* Method: getChildNodes(ArrayList<TreeNode> allNodes, String id) 
* 
*/ 
@Test
public void testGetChildNodes() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = GenerateTree.getClass().getMethod("getChildNodes", ArrayList<TreeNode>.class, String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
