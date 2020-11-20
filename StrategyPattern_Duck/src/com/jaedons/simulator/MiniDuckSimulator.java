package com.jaedons.simulator;

import org.junit.Test;

import com.jaedons.behavior.fly.impl.FlyRocketPowered;
import com.jaedons.duck.Duck;
import com.jaedons.duck.MallardDuck;
import com.jaedons.duck.ModelDuck;

/** 小小测试模拟  */
public class MiniDuckSimulator {
	
	/**测试*/
	@Test
	public void testModeDuc() {
		// 模型鸭 不会飞 只会叫 
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		// 更改配置 让它会飞
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
	@Test
	public void testMallarDuck() {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		duck.swim();
	}
}
