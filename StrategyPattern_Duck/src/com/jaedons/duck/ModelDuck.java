package com.jaedons.duck;

import com.jaedons.behavior.fly.impl.FlyNoWay;
import com.jaedons.behavior.quack.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println(" I'm a mode duck.");
	}

}
