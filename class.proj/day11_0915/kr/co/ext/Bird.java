package kr.co.ext;

import kr.co.inter.Flyable;
import kr.co.inter.Walkable;

public class Bird extends Animal implements Flyable, Walkable {

	private double wingSpan;

	public Bird(String name, int age, double wingSpan) {
		super(name, age);
		this.wingSpan = wingSpan;
		//System.out.println(this.name + this.age + this.wingSpan);
	}

	@Override
	public void walk() {
		System.out.println("총총총 걷는다.");
	}

	@Override
	public void fly() {
		System.out.println("훨훨 날아요.");

	}

}
