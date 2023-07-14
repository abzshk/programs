package com.user.practice;

import java.util.Stack;

public class HeightCalc {

	public static void main(String[] args) {
		int heights[]={10,6,8,5,11,9};
		int right[]=new int[6];
		int left[]=new int[6];
		int i=0,n=heights.length;
		Stack<Integer> st = new Stack<>();
		for(i=n-1;i>=0;i--) {
			while(!st.isEmpty() && heights[i]>st.peek()) {
				st.pop();
				++right[i];
			}
			if(!st.empty()) {
				++right[i];
			}
			st.push(heights[i]);
		}
		
		st.removeAllElements();
		for(i=0;i<n;i++) {
			while(!st.isEmpty() && heights[i]>st.peek()) {
				st.pop();
				++left[i];
			}
			if(!st.empty()) {
				++left[i];
			}
			st.push(heights[i]);
		}
		
		for(i=0;i<n;i++) {
			System.out.println("Buildings visible to right : "+right[i]+" of height : "+heights[i]+" and to left : "+left[i]);
		}
	}

}
