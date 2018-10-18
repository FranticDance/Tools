package main.java.com.jbutton.commons.tree.model;

import java.util.List;

/**
 * 树的节点类
 */
public class TreeNode {
    protected String id; //当前节点id
    protected String pId; //父节点id
    protected String title; //节点名称
    protected String icon; //节点图标
    protected int type; //节点类型
    protected Boolean isOpen; //节点是否打开
    protected List<? extends TreeNode> children;//孩子节点

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public List<? extends TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<? extends TreeNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id='" + id + '\'' +
                ", pId='" + pId + '\'' +
                ", title='" + title + '\'' +
                ", icon='" + icon + '\'' +
                ", type=" + type +
                ", isOpen=" + isOpen +
                ", children=" + children +
                '}';
    }
}
