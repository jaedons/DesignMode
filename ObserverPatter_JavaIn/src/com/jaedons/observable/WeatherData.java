package com.jaedons.observable;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public void setMeasurements(float temperature ,float humidity,float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
	private boolean changed = true;
	@Override
	protected synchronized void setChanged() {
		changed  = true;
		
	}
	
	@Override
	public void notifyObservers(Object arg) {
		
		if(changed) {
		}
		
	}
	
	
	
}
