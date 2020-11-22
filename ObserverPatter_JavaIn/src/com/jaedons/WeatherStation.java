package com.jaedons;

import org.junit.jupiter.api.Test;

import com.jaedons.observable.WeatherData;
import com.jaedons.service.CurrentConditionsDisplay;
/**拉取消息*/
public class WeatherStation {
	
	@Test
	public void testPullFromObservable() {
		// 添加 气象台 
		WeatherData weatherData = new WeatherData();
		
		// 添加 预定气象台的信息
		CurrentConditionsDisplay conditionsDisplay	= new CurrentConditionsDisplay(weatherData);
		
		// 气象台更改数据
		weatherData.setMeasurements(80, 65, 30.2f);
		// 推送给观测者
		weatherData.notifyObservers();
		// 观测者 接收消息 
		conditionsDisplay.update(weatherData, null);
	}
}
