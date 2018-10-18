package main.java.com.jbutton.commons.tree;

import main.java.com.jbutton.commons.tree.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 将数据具有树形结构的List，转为树
 */
public class GenerateTree {

    /**
     *
     * @param allNodes 存放树所有节点的list
     * @param rootNodeId 根节点的id，可以有多个根节点，根节点id可以为null或者其他字符串
     * @return
     */
    public static List<TreeNode> listToTree(List<TreeNode> allNodes, String rootNodeId){
        ArrayList<TreeNode> rootNodes = new ArrayList<>();//存放所有根节点
        ArrayList<TreeNode> childNodes = new ArrayList<>();//存放所有非根节点
        if(allNodes == null){
            throw new NullPointerException("没有树节点");
        }
        //查找所有根节点，将根节点和非根节点分开
        for(TreeNode treeNode: allNodes){
            if(rootNodeId == null){
                if(treeNode.getpId() == rootNodeId){
                    rootNodes.add(treeNode);
                }else {
                    childNodes.add(treeNode);
                }
            }else if(rootNodeId.equals(treeNode.getpId())){
                rootNodes.add(treeNode);
            }else {
                childNodes.add(treeNode);
            }
        }

        //遍历所有根节点，递归获取所有的子节点
        for(TreeNode treeNode : rootNodes){
            List<TreeNode> treeChildNodes = getChildNodes(childNodes, treeNode.getId());
            treeNode.setChildren(treeChildNodes);
        }

        return rootNodes;

    }

    private static List<TreeNode> getChildNodes(ArrayList<TreeNode> allNodes, String id) {
        ArrayList<TreeNode> parendNodes = new ArrayList<>();
        ArrayList<TreeNode> childNodes = new ArrayList<>();

        //找出父节点
        for(TreeNode treeNode : allNodes){
            if(id.equals(treeNode.getpId())){
                parendNodes.add(treeNode);
            }else {
                childNodes.add(treeNode);
            }
        }
        //递归找出子节点
        if(parendNodes.size() > 0){
            for(TreeNode treeNode : parendNodes){
                List<TreeNode> childNodes1 = getChildNodes(childNodes, treeNode.getId());
                treeNode.setChildren(childNodes1);
            }
        }

        return parendNodes;
    }
}
