package com.luni.recursion.backtracking;

import com.luni.recursion.util.TreeNode;

public class TreePaths {
    public static boolean doesUnblockedPathExists(TreeNode node) {
        if (node == null || node.data == 0){
            return false;
        }

        if (node.left == null && node.right == null)
            return true;

        if (doesUnblockedPathExists(node.left)) {
            return true;
        }

        if (doesUnblockedPathExists(node.right)) {
            return true;
        }
        return false;
    }
}
