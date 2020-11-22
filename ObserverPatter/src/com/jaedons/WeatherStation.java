package com.jaedons;

import com.jaedons.service.CurrentConditionsDisplay;
import com.jaedons.subject.impl.WeatherData;

/** 推送消息  */
public class WeatherStation {
	public static void main(String[] args) {
		// 添加 气象台 
		WeatherData weatherData = new WeatherData();
		
		// 添加 预定气象台的信息
		CurrentConditionsDisplay conditionsDisplay	= new CurrentConditionsDisplay(weatherData);
		
		// 气象台更改数据
		weatherData.setMeasurements(80, 65, 30.2f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 23.2f);
	}
}
