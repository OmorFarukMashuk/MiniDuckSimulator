package com.duck.controller;

import com.duck.fly.flyNoWay;
import com.duck.quack.Squeak;
import com.duck.type.Duck;
import com.duck.type.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		mallardDuck.setFlyBehavior(new flyNoWay());
		mallardDuck.setQuackBehavior(new Squeak());
		mallardDuck.performFly();
		mallardDuck.performQuack();

	}

}
