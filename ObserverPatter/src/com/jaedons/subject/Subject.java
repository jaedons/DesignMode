package com.jaedons.subject;

import com.jaedons.observer.Observer;

/** 主题 管理观测者*/
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
