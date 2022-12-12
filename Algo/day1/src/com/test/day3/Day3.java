package com.test.day3;

import java.util.*;

public class Day3 {
	
	public Day3() {
		
//		String s = "";
//		System.out.println(firstNonRepeatingIndex(s));
//
//		// Map iteration
//		System.out.println(mapIteration(arr));
		
		int[] arr = {5,9,6,10,3,8,1};
		Arrays.sort(arr);
		System.out.println(binarySearch(arr,5));
		int[] arr2 = {5,9,6,10,3,8,1};
		Arrays.sort(arr2);
		System.out.println(binarySearch(arr2,5));
		
	}
	
	int firstNonRepeatingIndex(String s) {
		
		if(s==null || "".equals(s)) return -1;
		
		Map<Character, Integer> resultSet = new HashMap<>();
		Set<Character> deleteSet = new HashSet<>();
		
		
		char[] c =  s.toCharArray();
		
		for(int i=0 ; i<c.length ; i++) {
			if(resultSet.get(c[i]) != null) {
				resultSet.put(c[i],i);
			} else {
				deleteSet.add(c[i]);
			}
		}
		
		deleteSet.forEach(resultSet::remove);
		
		return -1;
	}
	
	int mapIteration(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, i);
		}
		
		map.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
		
		int delete = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
			if(delete==entry.getKey()) map.remove(delete);
		}
		
		return map.size();
	}
	
	public static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int t) {
			value = t;
			left = null;
			right = null;
		}
		
		public TreeNode() {}
		
		public int getValue() {
			return value;
		}
		
		public TreeNode getLeft() {
			return left;
		}
		
		public TreeNode getRight() {
			return right;
		}
		
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		
		public void setRight(TreeNode right) {
			this.right = right;
		}
		
		public TreeNode add1(int t) {
			
			TreeNode newNode = new TreeNode(t);
			
			TreeNode temp = this;
			
			while(temp!=null) {
				if(newNode.getValue() > temp.getValue()) {
					if(temp.getRight()==null) {
						temp.setRight(newNode);
						break;
					} else {
						temp = temp.getRight();
					}
				} else {
					if(temp.getLeft()==null) {
						temp.setLeft(newNode);
						break;
					} else {
						temp = temp.getLeft();
					}
				}
			}
			
			return this;
		}
		
	}
	
	private TreeNode addRecursive(TreeNode current, int value) {
		if(current == null) {
			return new TreeNode(value);
		}
		
		if(value<current.getValue()) {
			current.left = addRecursive(current.left,value);
		} else if(value > current.value) {
			current.right = addRecursive(current.right,value);
		} else {
			return current;
		}
		
		return  current;
	}
	
	TreeNode treeNode(int[] arr) {
		
		
//		int j=0;
//
//		TreeNode t =
//
//		for(int i: arr) {
//			if(j>0) {
//				TreeNode t = new TreeNode(i);
//			}
//			j++;
//		}
//
//		return new TreeNode<>();
		
		return new TreeNode(-1);
	}
	
	int binarySearch(int[] arr, int target) {
		
		if(arr.length<=0) return -1;
		
		int l = 0;
		int r = arr.length-1;
		
		while(r-l>0) {
			if(arr[l]==target) return l;
			if(arr[r]==target) return r;
			
			int mid = (l + r)/2;
			if(arr[mid]==target) return mid;
			
			if(target>arr[mid]) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			
		}
		
		return -1;
	}
	
}
