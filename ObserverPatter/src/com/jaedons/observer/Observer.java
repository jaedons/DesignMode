package com.jaedons.observer;

/** 观测者 ： 可以从主题那块获取数据 */
public interface Observer {
	void update(float temperature ,float humidity,float pressure);
}
