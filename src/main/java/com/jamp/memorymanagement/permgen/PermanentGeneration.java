package com.jamp.memorymanagement.permgen;

import javassist.CannotCompileException;

public class PermanentGeneration {

	static javassist.ClassPool	cp	= javassist.ClassPool.getDefault();

	public static void main(String[] args) throws CannotCompileException,
	RuntimeException {

		for (int i = 0;; i++) {
			Class c = cp.makeClass(
			        "com.jamp.memorymanagement.permgen.NewClass" + i).toClass();
		}

	}

}
