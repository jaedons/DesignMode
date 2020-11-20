package com.jaedons.duck;

import com.jaedons.behavior.fly.IFlyBehavior;
import com.jaedons.behavior.quack.IQuackBehavior;

public abstract class Duck {
	
	/** 飞 */
	IFlyBehavior flyBehavior;
	/** 叫 */
	IQuackBehavior quackBehavior;
	
	/** 外貌 */
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	
	public void swim() {
		// All ducks float, even decoys!
		System.out.println("I'm swimming.");
	}

	/** 动态设置飞和叫的方式 */
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
