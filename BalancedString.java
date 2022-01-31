package com.balancedstring;

import java.util.Scanner;
import java.util.Stack; //using inbuilt stack

public class BalancedString {
	
	public static boolean isBalanced(String strexp) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<strexp.length();i++) {
			
			 char a = strexp.charAt(i);
			
			if(a == '(' || a == '[' || a == '{') {
				
				stack.push(a);
				continue;
				
			}
			
			if(stack.isEmpty()) {
				
				return false;
			}
			
			char b;
			
			switch(a) {
			
			case ')' : b = stack.pop();
					   if (b == '[' || b == '{')
						   return false;
					   break;
					   
			case ']' : b = stack.pop();
			   		   if (b == ')' || b == '{')
			   			   return false;
			   		   break;
			   
			case '}' : b = stack.pop();
			           if (b == '[' || b == '(')
			        	   return false;
			           break;
			}
			
		}
		
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		
		String strexp = sc.next();
		
		if(isBalanced(strexp)) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
