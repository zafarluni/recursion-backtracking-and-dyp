package com.luni;

import com.luni.recursion.backtracking.TreePaths;
import com.luni.recursion.util.*;

public class App {
	public static void main(String[] args) {
		TreeNode node = new TreeNode(8);
		
		node.left = new TreeNode(1);
		node.left.left =  new TreeNode(1);
		node.left.right = new TreeNode(0);
		
		node.right = new TreeNode(0);
		node.right.left = new TreeNode(2);
		node.right.right = new TreeNode(2);

		TreePrinter.printTreeNode(node);
		
		System.out.println(TreePaths.doesUnblockedPathExists(node));
	}
}