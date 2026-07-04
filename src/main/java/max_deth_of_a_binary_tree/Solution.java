package max_deth_of_a_binary_tree;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class Solution {
	public static class Node<T> {
		public T val;
		public Node<T> left;
		public Node<T> right;

		public Node(T val) {
			this(val, null, null);
		}

		public Node(T val, Node<T> left, Node<T> right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static int treeMaxDepth(Node<Integer> root) {
		// WRITE YOUR BRILLIANT CODE HERE
		int res = dfs(root);
		return res == 0 ? 0 : res - 1;
	}

	private static int dfs(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		return Math.max(dfs( root.left ), dfs(root.right)) + 1;
	}

	// this function builds a tree from input; you don't have to modify it
	// learn more about how trees are encoded in https://algo.monster/problems/serializing_tree
	public static <T> Node<T> buildTree(Iterator<String> iter, Function<String, T> f) {
		String val = iter.next();
		if (val.equals("x")) return null;
		Node<T> left = buildTree(iter, f);
		Node<T> right = buildTree(iter, f);
		return new Node<T>(f.apply(val), left, right);
	}

	public static List<String> splitWords(String s) {
		return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
	}

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Node<Integer> root = buildTree(splitWords(scanner.nextLine()).iterator(), Integer::parseInt);
		scanner.close();
		int res = treeMaxDepth(root);
		System.out.println(res);
	}
}

