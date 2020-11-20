package com.jaedons.behavior.fly.impl;

import com.jaedons.behavior.fly.IFlyBehavior;

public class FlyRocketPowered implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
