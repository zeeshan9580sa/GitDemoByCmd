package com.DataStructure;

import java.util.Stack;

public class StackArray {
	public static void main(String[] args) {
		/*
		 * int stack[] = new int[5]; int top=-1;
		 */
		Stack <Integer> stk=new Stack<>();
		stk.push(18);
		stk.pop();
		stk.isEmpty();
		System.out.println(stk);
		stk.push(3);
		System.out.println(stk);

	}

}
