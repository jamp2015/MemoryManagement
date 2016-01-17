package com.jamp.memorymanagement;

public class StackOverflowExample {

	public static void printIdentities(int nextIdentity) {
		System.out.println("The identity is: " + nextIdentity);
		if (nextIdentity > 0) {
			int next = nextIdentity + 1;
			printIdentities(next);
		}
	}

}
