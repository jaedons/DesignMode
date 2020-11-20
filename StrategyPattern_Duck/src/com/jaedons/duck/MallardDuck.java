package com.jaedons.duck;

import com.jaedons.behavior.fly.impl.FlyWithWings;
import com.jaedons.behavior.quack.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm real Mallard duck.");
	}

}
