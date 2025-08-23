package com.week3;

//Node class
class Nodee {
    int data;
    Nodee left, right;

    Nodee(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Nodee root;

    // Insert a node
    Nodee insert(Nodee root, int data) {
        if (root == null) {
            return new Nodee(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Search a value
    boolean search(Nodee root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // Inorder Traversal (Left → Root → Right)
    void inorder(Nodee root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal (Root → Left → Right)
    void preorder(Nodee root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal (Left → Right → Root)
    void postorder(Nodee root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

public class BSTrees {
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert nodes
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        // Traversals
        System.out.print("Inorder: ");
        bst.inorder(bst.root);   // 20 30 40 50 60 70 80
        System.out.println();

        System.out.print("Preorder: ");
        bst.preorder(bst.root);  // 50 30 20 40 70 60 80
        System.out.println();

        System.out.print("Postorder: ");
        bst.postorder(bst.root); // 20 40 30 60 80 70 50
        System.out.println();

        // Search
        System.out.println("Search 40: " + bst.search(bst.root, 40)); // true
        System.out.println("Search 90: " + bst.search(bst.root, 90)); // false
    }
}
