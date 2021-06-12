package com.sample;

import java.util.Arrays;

public class Solution {

	public int solution(int[] A) {
		int n = 1;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 0) {
				n = 1;
			} else {
				if (n == A[i]) {
					n++;
				} else {
				}
			}
		}
		return n;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = { -1, -3 };
		int[] B = { 1,1,1,1 };
		int[] C = { 1,3,6,4,1,2 };
		
		System.out.println(s.solution(A));
		System.out.println(s.solution(B));
		System.out.println(s.solution(C));
		
	}
}
