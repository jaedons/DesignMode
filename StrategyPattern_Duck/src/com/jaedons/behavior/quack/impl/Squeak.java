package com.jaedons.behavior.quack.impl;

import com.jaedons.behavior.quack.IQuackBehavior;

public class Squeak implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squack");
	}

}
