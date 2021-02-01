package com.duck.type;

import com.duck.fly.flyWithWings;
import com.duck.quack.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new flyWithWings();
	}
	public void display() {
		System.out.println("I am a real Mallard duck");
	}

}
