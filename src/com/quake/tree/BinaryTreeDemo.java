package com.quake.tree;

/**
 * @author AKA二夕
 * @create 2020-09-19 21:04
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
//先创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();

        //创建需要的节点
        HeroNode root = new HeroNode(1, "A");
        HeroNode node2 = new HeroNode(2, "B");
        HeroNode node3 = new HeroNode(3, "C");
        HeroNode node4 = new HeroNode(4, "D");
        HeroNode node5 = new HeroNode(5, "E");
        HeroNode node6 = new HeroNode(6, "F");
        HeroNode node7 = new HeroNode(7, "G");
        HeroNode node8 = new HeroNode(8, "H");

        //手动创建该该二叉树
        binaryTree.setRoot(root);
        root.setLeft(node2);
        root.setRight(node6);
        node2.setRight(node3);
        node3.setRight(node5);
        node3.setLeft(node4);
        node6.setRight(node7);
        node7.setLeft(node8);

        //测试 遍历
        System.out.println("前序遍历：");
        binaryTree.preOrder();
        System.out.println("中序遍历：");
        binaryTree.infixOrder();
        System.out.println("后序遍历：");
        binaryTree.postOrder();
    }
}

// 定义BinaryTree 二叉树
class BinaryTree {
    private HeroNode root;// 定义根节点

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    // 前序遍历
    public void preOrder() {
        if (this.root != null) {
            this.root.preOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    // 中序遍历
    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    // 后序遍历
    public void postOrder() {
        if (this.root != null) {
            this.root.postOrder();
        } else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
}

// 先创建HeroNode结点
class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                ", name='" + name + '\'' +
                ", no=" + no +
                '}';
    }

    // 编写前序遍历的方法
    public void preOrder() {
        System.out.println(this);// 先输出父结点
        // 递归向左子树前序遍历
        if (this.left != null) {
            this.left.preOrder();
        }
        // 向右子树前序遍历
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    // 中序遍历
    public void infixOrder() {
        // 递归向左子树中序遍历
        if (this.left != null) {
            this.left.infixOrder();
        }
        // 输出父结点
        System.out.println(this);
        // 递归向右子树中序遍历
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    // 后序遍历
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }
}