package com.Lab3DSA.BinarySearchTree.Main;

import com.Lab3DSA.BinarySearchTree.Functions.PairFinder;
import com.Lab3DSA.BinarySearchTree.Functions.Node;

public class Main {
    public static void main(String[] args) {
        // create the required tree
        Node root = null;
        Node rootNode = new Node(0);

        root = rootNode.insert(root, 40);
        root = rootNode.insert(root, 20);
        root = rootNode.insert(root, 60);
        root = rootNode.insert(root, 10);
        root = rootNode.insert(root, 30);
        root = rootNode.insert(root, 50);
        root = rootNode.insert(root, 70);

        int sum = 130;
        PairFinder.findPairWithSum(root, sum);
    }
}
