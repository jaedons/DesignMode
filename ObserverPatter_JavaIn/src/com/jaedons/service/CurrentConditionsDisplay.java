package com.jaedons.service;

import java.util.Observable;
import java.util.Observer;

import com.jaedons.observable.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	/** 可观察者 */
	Observable observable;
	
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		observable.addObserver(this);
		this.observable = observable;
	}
	
	@Override
	public void display() {

		System.out.println("Current conditions:"+
				this.temperature+"F degrees and "+
					this.humidity+"% humidity"
				);
		
	
	}

	@Override
	public void update(Observable observable, Object arg1) {
		if(observable instanceof WeatherData) {
			// 获取数据
			WeatherData weatherData = (WeatherData) observable;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			// 展示数据
			display();
		}
	}
	
}
