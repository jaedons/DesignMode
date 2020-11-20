package com.jaedons.behavior.quack.impl;

import com.jaedons.behavior.quack.IQuackBehavior;

public class Quack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
