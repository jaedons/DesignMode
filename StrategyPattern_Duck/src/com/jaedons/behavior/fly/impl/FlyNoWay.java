package com.jaedons.behavior.fly.impl;

import com.jaedons.behavior.fly.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly.");
	}

}
