package com.jaedons.behavior.quack.impl;

import com.jaedons.behavior.quack.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
