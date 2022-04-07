package com.wetagustin.observer.subjects;

import com.wetagustin.observer.observers.Observer;

public interface Subject {

    void subscribeObserver(Observer observer);
    void unsubscribeObserver(Observer observer);
    void notifyObservers();

}
