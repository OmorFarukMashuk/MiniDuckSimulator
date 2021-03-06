package com.duck.type;

import com.duck.fly.FlyBehavior;
import com.duck.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void swim() {
		System.out.println("I am swimming");
		
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
		
	}
	public void performFly() {
		flyBehavior.fly();
		
	}
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
		
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

}
